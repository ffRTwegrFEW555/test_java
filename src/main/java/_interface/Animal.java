package _interface;

/**
 * Created by USER on 16.11.2016, 17:21.
 */
public interface Animal {
    int age = 2;
    int number = 3;
    int random = 777;

    default int getAge() {
        return this.age;
    }

    default int getNumber() {
        return this.number;
    }

    default int getRandom() {
        return this.random;
    }

    void printText();
}
