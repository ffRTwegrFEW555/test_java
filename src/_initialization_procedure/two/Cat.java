package _initialization_procedure.two;

import java.util.ArrayList;

public class Cat {

    // Переменные экземпляра и класса.
    private static ArrayList<String> order = new ArrayList<>();

    private Initializer initializer = new Initializer();
    private String name;
    private static String color;
    private int age;

    // Инициализатор
    {
        name = "Angry cat";
        order.add("non-static initializer");
    }

    // Статический инициализатор
    static {
        color = "Striped";
        order.add("static initializer");
    }

    // Конструктор
    public Cat() {
        age = 10;
        order.add("Constructor");
    }

    // Внутренний класс
    private class Initializer {
        Initializer() {
            order.add("class Initializer");
        }
    }

    // Геттер
    public static ArrayList<String> getOrder() {
        return order;
    }

    // Запуск
    public static void main(String[] args) {
        for (String s : new Cat().getOrder())
            System.out.println(s);
    }
}
