package main.controller;

import javafx.fxml.FXML;
import main.SetPassword;
import main.model.ForgetModel;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.sql.SQLException;


public class ForgetController {

    @FXML
    private Label question;
    @FXML
    private TextField txtUname;
    @FXML
    private TextField txtAnswer;
    @FXML
    private Label status;

    public ForgetModel forgetModel = new ForgetModel();

    public static String current_user;
    public static String now_user;

    public void confirmUname(ActionEvent event){
        try{
            if(forgetModel.isUser(txtUname.getText())){
                question.setText(forgetModel.getQuestion(txtUname.getText()));
                current_user = txtUname.getText();
            }
            else {
                status.setText("No such User");
            }
        }
        catch (SQLException e) {
        e.printStackTrace();
    }

    }
    public void confirmAnswer(ActionEvent event){
        try{
            if(forgetModel.isCorrect(txtUname.getText(),txtAnswer.getText())){
                SetPassword setPassword = new SetPassword();
                setPassword.showWindow();
                now_user = txtUname.getText();
            }
            else {
                status.setText("Wrong answer");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
    public String now_user(){
        return now_user;
    }
}
