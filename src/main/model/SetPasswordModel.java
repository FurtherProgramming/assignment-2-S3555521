package main.model;

import main.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SetPasswordModel {
    Connection connection;

    public SetPasswordModel() {

        connection = SQLConnection.connect();
        if (connection == null)
            System.exit(1);

    }
    public void setPassword(String password, String username) throws SQLException {
        String query = "update employee set password = ? where username = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, password);
            preparedStatement.setString(2, username);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }
}
