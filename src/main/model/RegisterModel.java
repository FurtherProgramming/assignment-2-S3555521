package main.model;

import javafx.event.ActionEvent;
import main.SQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterModel {
    static PreparedStatement sql;
    Connection connection;
    String insert = "insert into employee values(?,?,?,?,?,?,?,?,false)";

    public RegisterModel(){

        connection = SQLConnection.connect();
        if (connection == null)
            System.exit(1);
    }

    public void toRegister( int em_id, String fName, String lName,String role, String uName, String password, String question, String answer){
        try{
            sql=connection.prepareStatement(insert);
            sql.setInt(1,em_id);
            sql.setString(2,fName);
            sql.setString(3,lName);
            sql.setString(4,role);
            sql.setString(5,uName);
            sql.setString(6,password);
            sql.setString(7,question);
            sql.setString(8,answer);
            sql.executeUpdate();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



}
