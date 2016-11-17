package _functional_lambda.test.entity;

/**
 * Created by USER on 12.11.2016, 21:43.
 */
@FunctionalInterface
public interface UserFactory {
    User create(String name, int age);
}
