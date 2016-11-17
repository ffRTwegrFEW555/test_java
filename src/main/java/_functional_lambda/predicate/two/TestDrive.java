package _functional_lambda.predicate.two;

import java.util.List;
import java.util.Arrays;

/**
 * Created by USER on 17.11.2016, 16:02.
 */
public class TestDrive {
    public static void main(String[] args) {

        //
        List<User> userList = Arrays.asList(
                new User("John", 30, 2),
                new User("Adam", 31, 2),
                new User("Mark", 34, 2),
                new User("Eva", 27, 1),
                new User("Lucy", 28, 1),
                new User("Tony", 27, 1),
                new User("Mark", 29, 2)
        );

        //
        List<User> userListResult;

        //
        userListResult =
                UserPredicates.filterUser(userList, UserPredicates.isAdultFemale());
        System.out.println(userListResult);
        System.out.println();

        //
        System.out.println(
                UserPredicates.filterUser(userList, UserPredicates.isAgeMoreThen(30))
        );
        System.out.println();

        //
        System.out.println(
                UserPredicates.filterUser(userList, UserPredicates.isName("mARk"))
        );
        System.out.println();

    }
}
