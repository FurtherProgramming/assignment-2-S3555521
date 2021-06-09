package main.model;


import main.SQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterModel {
    static PreparedStatement sql;
    static PreparedStatement bl;
    Connection connection;
    String insert = "insert into employee values(?,?,?,?,?,?,?,?,false)";
    String blk = "insert into blacklist values(?,?,?,true)";

    public RegisterModel(){

        connection = SQLConnection.connect();
        if (connection == null)
            System.exit(1);
    }

    public void toRegister( int em_id, String fName, String lName,String role, String uName, String password, String question, String answer){
        PreparedStatement sql = null;
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

    public void toBlacklist(int id){
        try{
            bl = connection.prepareStatement(blk);
            bl.setInt(1,id);
            bl.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



}
