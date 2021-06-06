package main.model;

import main.SQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainEmpModel {
    Connection connection;

    public MainEmpModel() {

        connection = SQLConnection.connect();
        if (connection == null)
            System.exit(1);

    }

    public String getId(String user) throws SQLException {
        String query = "select * from employee where username = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            resultSet = preparedStatement.executeQuery();
            String id = resultSet.getString("id");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return query;
    }

    public String getName(String user) throws SQLException {
        String query = "select * from employee where username = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            resultSet = preparedStatement.executeQuery();
            String name = resultSet.getString("name");
            return name;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return query;
    }

    public String getSname(String user) throws SQLException {
        String query = "select * from employee where username = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            resultSet = preparedStatement.executeQuery();
            String sname = resultSet.getString("sure name");
            return sname;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return query;
    }

    public String getRole(String user) throws SQLException {
        String query = "select * from employee where username = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            resultSet = preparedStatement.executeQuery();
            String role = resultSet.getString("role");
            return role;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return query;
    }

}
