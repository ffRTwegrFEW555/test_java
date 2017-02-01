package _sql._test1;

import java.sql.*;

/**
 * Created by USER on 30.12.2016, 21:17.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class MySQL {

    // https://dev.mysql.com/doc/connector-j/5.1/en/connector-j-reference-configuration-properties.html
    private final static String DB_URL  =
                    "jdbc:mysql://localhost:3306/test" +
                    "?autoReconnect=true" +
                    "&useSSL=false" /*+
                    "&useJDBCCompliantTimezoneShift=true" +
                    "&useLegacyDatetimeCode=false" +
                    "&serverTimezone=UTC"*/;
    private final static String DB_USER = "root";
    private final static String DB_PASS = "root";

    //
    public static void main(String[] args) {
        try (   Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                Statement statement = connection.createStatement()) {

            // === execute
            // statement.execute("INSERT INTO user (name, age, isAdmin) values ('test', 777, true)");

            // === executeUpdate
            // int countOfUpdates = statement.executeUpdate("UPDATE user SET name = 'newTest' where id = 98");
            // System.out.println("countOfUpdates: " + countOfUpdates);

            // === executeQuery
            // ResultSet resultSet = statement.executeQuery("SELECT * FROM user");
            // System.out.println(resultSet);

            // === Example
            // while(resultSet.next()) {
            //    String name = resultSet.getString;
            //    int age = resultSet.getInt;
            //    BigDecimal bd = resultSet.getBigDecimal;
            // }

            // === Example
            // while(resultSet.next()){
            //    for (int i = 1; i <= columns; i++){
            //        System.out.print(resultSet.getString(i) + "\t");
            //    }
            //    System.out.println();
            // }

            // === executeBatch
            statement.addBatch("INSERT INTO user (name, age, isAdmin) values ('test', 777, true)");
            statement.addBatch("INSERT INTO user (name, age, isAdmin) values ('test2', 777, true)");
            statement.addBatch("INSERT INTO user (name, age, isAdmin) values ('test3', 777, true)");
            int[] result = statement.executeBatch();
            statement.clearBatch();
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
