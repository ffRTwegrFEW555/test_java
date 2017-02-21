package _tests.test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    private static int graphCounter = 0;
    private static int graphCounterResult = 0;
    private static Set<AtomicInteger> atomicGraphIds = new LinkedHashSet<>();
    private static Set<AtomicBoolean> atomicMarkedSet = new LinkedHashSet<>();

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader   = new BufferedReader(new InputStreamReader(System.in));
        int numberOfVertex              = Integer.parseInt(bufferedReader.readLine().split(" ")[0]);
        int[] edgesToDelete             = {0};
        Map<Integer, Vertex> vertexes   = new LinkedHashMap<>();
        Map<Integer, Edge> edges        = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfVertex; i++) {
            vertexes.put(i, new Vertex(i));
        }

        while (true) {
            String nextLine = bufferedReader.readLine();
            if (nextLine == null) {
                break;
            }

            String[] parseLineResult = nextLine.split(" ");

            if (parseLineResult.length == 1) {
                edgesToDelete = new int[Integer.parseInt(parseLineResult[0])];
                String[] edgesToDeleteString = bufferedReader.readLine().split(" ");

                for (int i = 0; i < edgesToDeleteString.length; i++) {
                    edgesToDelete[i] = Integer.parseInt(edgesToDeleteString[i]);
                }
                break;

            } else {
                Vertex one = vertexes.get(Integer.parseInt(parseLineResult[0]));
                Vertex two = vertexes.get(Integer.parseInt(parseLineResult[1]));
                Edge edge = new Edge();

                one.edges.add(edge);
                two.edges.add(edge);
                edge.vertexes[0] = one;
                edge.vertexes[1] = two;

                edges.put(edge.id, edge);
            }
        }

        for (int i = 0; i < edgesToDelete.length; i++) {
            Edge edge = edges.get(edgesToDelete[i]);
            edge.vertexes[0].edges.remove(edge);
            edge.vertexes[1].edges.remove(edge);
            edges.remove(edgesToDelete[i]);

            Set<Integer> toRemove = new LinkedHashSet<>();

            for (Map.Entry<Integer, Vertex> entry : vertexes.entrySet()) {
                Vertex v = entry.getValue();
                if (v.edges.size() == 0) {
                    graphCounterResult++;
                    toRemove.add(entry.getKey());
                } else if (v.graphId.get() == 0) {
                    AtomicInteger tempId = new AtomicInteger(++graphCounter);
                    atomicGraphIds.add(tempId);
                    markAllVertexInGraph(v, tempId);
                }
            }

            for (Integer remove : toRemove) {
                vertexes.remove(remove);
            }

            System.out.print(graphCounter + graphCounterResult + " ");
            graphCounter = 0;

            for (AtomicInteger a : atomicGraphIds) {
                a.set(0);
            }
            atomicGraphIds.clear();

            for (AtomicBoolean a : atomicMarkedSet) {
                a.set(false);
            }
            atomicMarkedSet.clear();
        }
    }

    private static class Vertex {
        public AtomicInteger graphId = new AtomicInteger();
        public int id;
        public Set<Edge> edges = new LinkedHashSet<>();

        public Vertex(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            return id == ((Vertex) o).id;
        }

        @Override
        public int hashCode() {
            return id;
        }
    }

    private static class Edge {
        public static int counter = 0;
        public int id;
        public AtomicBoolean isMarked = new AtomicBoolean();
        public Vertex[] vertexes = new Vertex[2];

        public Edge() {
            id = ++counter;
        }

        @Override
        public boolean equals(Object o) {
            return id == ((Edge) o).id;
        }

        @Override
        public int hashCode() {
            return id;
        }
    }

    private static void markAllVertexInGraph(Vertex vertex, AtomicInteger id) {
        if (vertex.graphId.get() == 0) {
            vertex.graphId = id;
            for (Edge edge : vertex.edges) {
                if (!edge.isMarked.get()) {
                    AtomicBoolean a = new AtomicBoolean(true);
                    edge.isMarked = a;
                    atomicMarkedSet.add(a);
                    for (Vertex v : edge.vertexes) {
                        if (v.graphId.get() == 0) {
                            markAllVertexInGraph(v, id);
                        }
                    }
                }
            }
        }
    }
}
