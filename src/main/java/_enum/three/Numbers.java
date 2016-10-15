package _enum.three;

/**
 * Created by USER on 26.09.2016.
 */
public enum Numbers {

    ONE("One", 10),
    TWO("Two", 20),
    THREE("Three", 30) {
        @Override
        public void printText() {
            System.out.println("=================================");
            super.printText();
            System.out.println("last.");
            System.out.println("=================================");
        }
    };

    private String name;
    private int age;

    Numbers(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printText() {
        System.out.println(String.format("%-10s %-10s", name, age));
    }
}
