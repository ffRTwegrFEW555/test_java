package _autoclosable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestDrive2_2 {
    public static void main(String[] args) throws IOException, InterruptedException {

        //
        BufferedReader bufferedReader = null;

        br(bufferedReader);
        System.out.println(bufferedReader);
        System.out.println();
    }

    private static void br(BufferedReader br) throws IOException {

        // Аргументы в метод всегда передаются по значению, то есть копируются биты, которые содержит переменная.
        // То есть мы передали копию битов (описывающие способ получения объекта, то есть ссылку)
        // в новую переменную (параметр), а не объект.
        // Следовательно первый bufferedReader всегда будет null, мы скопировали пустую ссылку в "br".
        // Мы работаем не с переменной, а с ссылкой на объект.
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine());
    }
}
