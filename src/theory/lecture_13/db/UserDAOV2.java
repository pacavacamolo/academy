package theory.lecture_13.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOV2 extends AbstractDAO {

    String getQuery = "SELECT * FROM employee WHERE id=?";

    @Override
    public User getUser(int userId) {

        User user = new User();
        try (
                Connection connection = JDBCFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(getQuery)) {

            statement.setInt(1, userId);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                user.setName(rs.getString(1));
                user.setAge(rs.getInt(2));
                //номер текущей колонки
//                rs.getRow();

            }

        } catch (SQLException e) {
        }
        return user;
    }

}
