package _proxy;

import java.lang.reflect.Proxy;

/**
 * Created by USER on 24.02.2017, 2:40.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {
        Person person = new Person("Mary", 30);

        Class clazz = person.getClass();
        Unit proxy = (Unit) Proxy.newProxyInstance(
                clazz.getClassLoader(),
                clazz.getInterfaces(),
                (proxy1, method, args1) -> {
                    System.out.println("Proxy: before");
                    Object result = method.invoke(person, args1);
                                    method.invoke(person, args1);
                    System.out.println("Proxy: after");

                    return result;
                });

        proxy.printText();
    }
}
