package main.model;

import main.SQLConnection;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MainAdmModel {
    Connection connection;

    public MainAdmModel() {

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

        return null;
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

        return null;
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

        return null;
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

        return null;
    }

    public String getUname(int id) throws SQLException {
        String query = "select * from employee where id = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            String name = resultSet.getString("username");
            return name;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return null;
    }

    public String getPassword(String user) throws SQLException {
        String query = "select * from employee where username = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            resultSet = preparedStatement.executeQuery();
            String password = resultSet.getString("password");
            return password;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return null;
    }

    public String getQuestion(String user) throws SQLException {
        String query = "select * from employee where username = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            resultSet = preparedStatement.executeQuery();
            String question = resultSet.getString("question");
            return question;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return null;
    }

    public String getAnswer(String user) throws SQLException {
        String query = "select * from employee where username = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            resultSet = preparedStatement.executeQuery();
            String answer = resultSet.getString("answer");
            return answer;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return null;
    }

    public Boolean getAdmin(String user) throws SQLException {
        String query = "select * from employee where username = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            resultSet = preparedStatement.executeQuery();
            return resultSet.getBoolean("admin");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return null;
    }



    public Boolean isBooking(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }finally {
            preparedStatement.close();
            resultSet.close();
        }
    }

    public void createBooking(Date date) throws SQLException {
        String query = "insert into bookings values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            preparedStatement.setInt(2, 0);
            preparedStatement.setInt(3, 0);
            preparedStatement.setInt(4, 0);
            preparedStatement.setInt(5, 0);
            preparedStatement.setInt(6, 0);
            preparedStatement.setInt(7, 0);
            preparedStatement.setInt(8, 0);
            preparedStatement.setInt(9, 0);
            preparedStatement.setInt(10, 0);
            preparedStatement.setInt(11, 0);
            preparedStatement.setInt(12, 0);
            preparedStatement.setInt(13, 0);
            preparedStatement.setInt(14, 0);
            preparedStatement.setInt(15, 0);
            preparedStatement.setInt(16, 0);
            preparedStatement.setInt(17, 0);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
        }
    }

    public int getS1(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit1");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public int getS2(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit2");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public int getS3(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit3");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public int getS4(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit4");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public int getS5(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit5");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public int getS6(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit6");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public int getS7(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit7");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public int getS8(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit8");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public int getS9(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit9");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public int getS10(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit10");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public int getS11(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit11");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public int getS12(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit12");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public int getS13(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit13");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public int getS14(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit14");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public int getS15(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit15");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public int getS16(Date date) throws SQLException {
        String query = "select * from bookings where date = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            resultSet = preparedStatement.executeQuery();
            int id = resultSet.getInt("sit16");
            return id;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }


    public ArrayList getUsers() throws SQLException {
        String query = "select id from employee";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList list = new ArrayList();
        try {
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                list.add(resultSet.getInt("id"));
            }
            return list;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
            resultSet.close();
        }

        return null;

    }

    public ArrayList getBids() throws SQLException {
        String query = "select bid from blacklist";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList list = new ArrayList();
        try {
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                list.add(resultSet.getInt("bid"));
            }
            return list;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
            resultSet.close();
        }

        return null;

    }

    public void create(int em_id, String fName, String lName,String role, String uName, String password, String question, String answer, Boolean admin) throws SQLException {
        String query = "insert into employee values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, em_id);
            preparedStatement.setString(2, fName);
            preparedStatement.setString(3,lName);
            preparedStatement.setString(4,role);
            preparedStatement.setString(5,uName);
            preparedStatement.setString(6,password);
            preparedStatement.setString(7,question);
            preparedStatement.setString(8,answer);
            preparedStatement.setBoolean(9,admin);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void update(int em_id, String fName, String lName,String role, String uName, String password, String question, String answer, Boolean admin) throws SQLException {
        String query = "update employee set name = ? , \"sure name\" = ? , role = ? , username = ? , password = ? , question = ? , answer = ? , admin = ? where id = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,fName);
            preparedStatement.setString(2,lName);
            preparedStatement.setString(3,role);
            preparedStatement.setString(4,uName);
            preparedStatement.setString(5,password);
            preparedStatement.setString(6,question);
            preparedStatement.setString(7,answer);
            preparedStatement.setBoolean(8,admin);
            preparedStatement.setInt(9, em_id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void delete(int id) throws SQLException {
        String query = "delete from employee where id = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
        preparedStatement.close();
        }
    }

    public void deleteBlacklist(int id) throws SQLException {
        String query = "delete from blacklist where bid = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS1(Date date) throws SQLException {
        String query = "update bookings set sit1 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS2(Date date) throws SQLException {
        String query = "update bookings set sit2 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS3(Date date) throws SQLException {
        String query = "update bookings set sit3 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS4(Date date) throws SQLException {
        String query = "update bookings set sit4 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS5(Date date) throws SQLException {
        String query = "update bookings set sit5 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS6(Date date) throws SQLException {
        String query = "update bookings set sit6 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS7(Date date) throws SQLException {
        String query = "update bookings set sit7 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS8(Date date) throws SQLException {
        String query = "update bookings set sit8 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS9(Date date) throws SQLException {
        String query = "update bookings set sit9 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS10(Date date) throws SQLException {
        String query = "update bookings set sit10 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS11(Date date) throws SQLException {
        String query = "update bookings set sit11 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS12(Date date) throws SQLException {
        String query = "update bookings set sit12 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS13(Date date) throws SQLException {
        String query = "update bookings set sit13 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS14(Date date) throws SQLException {
        String query = "update bookings set sit14 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS15(Date date) throws SQLException {
        String query = "update bookings set sit15 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void cancelS16(Date date) throws SQLException {
        String query = "update bookings set sit16 = 0 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void lockS1(Date date) throws SQLException {
        String query = "update bookings set sit1 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void lockS2(Date date) throws SQLException {
        String query = "update bookings set sit2 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }
    public void lockS3(Date date) throws SQLException {
        String query = "update bookings set sit3 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }
    public void lockS4(Date date) throws SQLException {
        String query = "update bookings set sit4 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }
    public void lockS5(Date date) throws SQLException {
        String query = "update bookings set sit5 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }
    public void lockS6(Date date) throws SQLException {
        String query = "update bookings set sit6 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }
    public void lockS7(Date date) throws SQLException {
        String query = "update bookings set sit7 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }
    public void lockS8(Date date) throws SQLException {
        String query = "update bookings set sit8 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }
    public void lockS9(Date date) throws SQLException {
        String query = "update bookings set sit9 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }
    public void lockS10(Date date) throws SQLException {
        String query = "update bookings set sit10 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }
    public void lockS11(Date date) throws SQLException {
        String query = "update bookings set sit11 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }
    public void lockS12(Date date) throws SQLException {
        String query = "update bookings set sit12 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }
    public void lockS13(Date date) throws SQLException {
        String query = "update bookings set sit13 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }
    public void lockS14(Date date) throws SQLException {
        String query = "update bookings set sit14 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }
    public void lockS15(Date date) throws SQLException {
        String query = "update bookings set sit15 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }
    public void lockS16(Date date) throws SQLException {
        String query = "update bookings set sit16 = 99 where date = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }

    public void createRelease(Date date,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16) throws SQLException {
        String query = "insert into release values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, date);
            preparedStatement.setInt(2, s1);
            preparedStatement.setInt(3, s2);
            preparedStatement.setInt(4, s3);
            preparedStatement.setInt(5, s4);
            preparedStatement.setInt(6, s5);
            preparedStatement.setInt(7, s6);
            preparedStatement.setInt(8, s7);
            preparedStatement.setInt(9, s8);
            preparedStatement.setInt(10, s9);
            preparedStatement.setInt(11, s10);
            preparedStatement.setInt(12, s11);
            preparedStatement.setInt(13, s12);
            preparedStatement.setInt(14, s13);
            preparedStatement.setInt(15, s14);
            preparedStatement.setInt(16, s15);
            preparedStatement.setInt(17, s16);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
        }
    }

    public void employeeList() throws IOException, SQLException {
        File file =new File("C://employees.csv");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        String query = "select * from employee";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String sName = resultSet.getString("sure name");
                String role = resultSet.getString("role");
                String uName = resultSet.getString("username");
                String password = resultSet.getString("password");
                String question = resultSet.getString("question");
                String answer = resultSet.getString("answer");
                Boolean admin = resultSet.getBoolean("admin");
                String str = "id:" + id + " firstname:" +name + " lastname:" + sName + " role:"+ role + " username:" + uName + " password:" + password + " question:" + question + " answer:" + answer + " admin:" + admin.toString();
                writer.write(str);
                writer.newLine();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            writer.close();
            preparedStatement.close();
            resultSet.close();
        }
    }


    public void releaseList() throws IOException, SQLException {
        File file =new File("C://released bookings.csv");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        String query = "select * from release";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Date date = resultSet.getDate("date");
                String  s1 = Integer.toString(resultSet.getInt("sit1"));
                String  s2 = Integer.toString(resultSet.getInt("sit2"));
                String  s3 = Integer.toString(resultSet.getInt("sit3"));
                String  s4 = Integer.toString(resultSet.getInt("sit4"));
                String  s5 = Integer.toString(resultSet.getInt("sit5"));
                String  s6 = Integer.toString(resultSet.getInt("sit6"));
                String  s7 = Integer.toString(resultSet.getInt("sit7"));
                String  s8 = Integer.toString(resultSet.getInt("sit8"));
                String  s9 = Integer.toString(resultSet.getInt("sit9"));
                String  s10 = Integer.toString(resultSet.getInt("sit10"));
                String  s11 = Integer.toString(resultSet.getInt("sit11"));
                String  s12 = Integer.toString(resultSet.getInt("sit12"));
                String  s13 = Integer.toString(resultSet.getInt("sit13"));
                String  s14 = Integer.toString(resultSet.getInt("sit14"));
                String  s15 = Integer.toString(resultSet.getInt("sit15"));
                String  s16 = Integer.toString(resultSet.getInt("sit16"));
                String str = "date:" + date.toString() + " sit1: " + s1 + " sit2: " + s2 + " sit3: " + s3 + " sit4: " + s4 + " sit5: " + s5 + " sit6: " + s6 + " sit7: " + s7 + " sit8: " + s8 + " sit9: " + s9 + " sit10: " + s10 + " sit11: " + s11 + " sit12: " + s12 + " sit13: " + s13 + " sit14: " + s14 + " sit15: " + s15 + " sit16: " + s16;
                writer.write(str);
                writer.newLine();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            writer.close();
            preparedStatement.close();
            resultSet.close();
        }
    }

    public int getBsid(int id) throws SQLException {
        String query = "select * from blacklist where bid = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            int sid = resultSet.getInt("sid");
            return sid;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return 0;
    }

    public Date getBdate(int id) throws SQLException {
        String query = "select * from blacklist where bid = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            Date date = resultSet.getDate("date");
            return date;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return null;
    }

    public Boolean getAvailable(int id) throws SQLException {
        String query = "select * from blacklist where bid = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            return resultSet.getBoolean("isBooking");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

        return null;
    }

    public void blacklistUpdate(int bid, Date date, int sid, Boolean is) throws SQLException {
        String query = "update blacklist set date = ?, sid = ?, isBooking = ? where bid = ?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,date);
            preparedStatement.setInt(2,sid);
            preparedStatement.setBoolean(3,is);
            preparedStatement.setInt(4,bid);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            preparedStatement.close();
        }
    }







}
