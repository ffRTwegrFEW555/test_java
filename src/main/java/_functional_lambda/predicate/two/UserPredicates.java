package _functional_lambda.predicate.two;

import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Objects;

/**
 * Created by USER on 17.11.2016, 16:03.
 */
public class UserPredicates {
    public static Predicate<User> isAdultFemale() {
        return (u) -> u.getAge() > 18 && u.getGender() == 1;
    }

    public static Predicate<User> isAgeMoreThen(int age) {
        return (u) -> u.getAge() > age;
    }

    public static Predicate<User> isName(String name) {
        return (u) -> u.getName().equalsIgnoreCase(name);
    }

    public static Predicate<User> nonNullPredicate = Objects::nonNull;

    public static List<User> filterUser(List<User> users, Predicate<User> predicate) {
        return users
                .stream()
                .filter(nonNullPredicate.and(predicate))
                .collect(Collectors.toList());
    }
}
