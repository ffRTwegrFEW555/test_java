package _sql._test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by USER on 31.12.2016, 8:55.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
final class DBUtil {

    private static final String DB_URL  =
                    "jdbc:mysql://localhost:3306/test" +
                    "?autoReconnect=true" +
                    "&useSSL=false" /*+
                    "&useJDBCCompliantTimezoneShift=true" +
                    "&useLegacyDatetimeCode=false" +
                    "&serverTimezone=UTC"*/;
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root";
    private static Connection connection;

    private DBUtil() {

    }

    public static Connection getConnection() {
        if (connection == null) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                System.out.println("Connection open.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("Connection close.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
