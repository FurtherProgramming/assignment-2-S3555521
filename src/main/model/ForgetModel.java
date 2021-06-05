package main.model;

import main.SQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ForgetModel {
    Connection connection;

    public ForgetModel() {

        connection = SQLConnection.connect();
        if (connection == null)
            System.exit(1);

    }

    public Boolean isUser(String user) throws SQLException {
        String query = "select * from employee where username = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        } finally {
            preparedStatement.close();
            resultSet.close();
        }
    }

    public String getQuestion(String user) throws SQLException {
        String query = "select * from employee where username = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            resultSet = preparedStatement.executeQuery();
            String answer = resultSet.getString("question");
            return answer;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return query;
    }

    public Boolean isCorrect(String user, String answer) throws SQLException {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String query = "select * from employee where username = ? and answer= ?";
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            preparedStatement.setString(2, answer);

            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

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
