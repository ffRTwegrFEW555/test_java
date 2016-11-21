package _stream.collect;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Collector;
import java.util.ArrayList;

/**
 * Created on 21.11.2016, 18:10.
 *
 * @author Vadim Gamaliev <gamaliev-vadim@yandex.com>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {

        //
        List<User> users = Arrays.asList(
                new User("Bob", 30),
                new User("July", 31),
                new User("Mark", 32),
                new User("Margarete", 33),
                new User("July", 30)
        );

        //
        List<User> filteredUsers = users
                .stream()
                .filter((p) -> "july".equalsIgnoreCase(p.getName()))
                .collect(Collectors.toList());
        System.out.println(filteredUsers);
        System.out.println();

        //
        IntSummaryStatistics intSummaryStatistics = users
                .stream()
                .collect(Collectors.summarizingInt(User::getAge));
        System.out.println(intSummaryStatistics);
        System.out.println();

        //
        Map<String, List<User>> integerListMap = users
                .stream()
                .collect(Collectors.groupingBy(User::getName));

        integerListMap.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println();

        //
        Map<Integer, User> userMap = users
                .stream()
                .collect(Collectors.toMap(User::getId, Function.identity()));

        userMap.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println();

        //
        Map<String, String> stringStringMap = users
                .stream()
                .collect(Collectors.toMap(
                        User::getName,
                        (u) -> String.valueOf(u.getAge()),
                        (a1, a2) -> a1 + " | " + a2));

        stringStringMap.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println();

        //
        Collector<User, ?, ArrayList<User>> userListCollector =
                Collector.of(
                        ArrayList::new,
                        (objects, user) -> {
                            user.setName(user.getName().concat("_new"));
                            objects.add(user);
                        },
                        (left, right) -> {
                            left.addAll(right);
                            return left;
                        });

        ArrayList<User> collect = users
                .stream()
                .collect(userListCollector);

        System.out.println(collect);
        System.out.println();

        //
        Collector<User, StringJoiner, String> userStringJoinerStringCollector =
                Collector.of(
                        () -> new StringJoiner(" / "),
                        (sj, u) -> sj.add(
                                        u.getId() + "-" +
                                        u.getName() + "-" +
                                        u.getAge()),
                        StringJoiner::merge,
                        (sj) -> sj.toString().toUpperCase()
                );

        System.out.println(
                users
                    .stream()
                    .collect(userStringJoinerStringCollector)
        );
        System.out.println();


    }
}
