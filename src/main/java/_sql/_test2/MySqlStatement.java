package _sql._test2;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * Created by USER on 31.12.2016, 9:05.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class MySqlStatement {

    public static void main(String[] args) {

        try {
            String sqlQueryTimeZone = "SET time_zone = '+00:00'";
            String sqlQuerySelect   = "SELECT * FROM user";

            Statement statement = DBUtil.getConnection().createStatement();
            statement.execute(sqlQueryTimeZone);
            statement.executeQuery(sqlQuerySelect);
            ResultSet users = statement.getResultSet();

            while (users.next()) {
                System.out.println(new User(
                        users.getInt("id"),
                        users.getString("name"),
                        users.getInt("age"),
                        users.getBoolean("isAdmin"),
                        users.getTimestamp("createdDate").toLocalDateTime()));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection();
        }

    }
}
