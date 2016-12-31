package _sql._test2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by USER on 31.12.2016, 9:05.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class MySqlPreparedStatement {

    public static void main(String[] args) {

        try {
            String sqlQueryTimeZone = "SET time_zone = '+00:00'";
            String sqlQuerySelect   = "SELECT * FROM user";
            String sqlQueryAddUsers = "INSERT INTO user (name, age, isAdmin) VALUES (?, ?, ?)";

            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sqlQueryAddUsers);
            preparedStatement.setString (1, "Test111");
            preparedStatement.setInt    (2, 23);
            preparedStatement.setBoolean(3, true);
            preparedStatement.addBatch();
            preparedStatement.addBatch(sqlQueryTimeZone);
            preparedStatement.executeBatch();
            ResultSet users = preparedStatement.executeQuery(sqlQuerySelect);

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
