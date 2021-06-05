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
    @FXML
    private Label passwordStatus;
    @FXML
    private TextField txtPassword1;
    @FXML
    private TextField txtPassword2;

    public ForgetModel forgetModel = new ForgetModel();

    public static String current_user;

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
                current_user = txtUname.getText();
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
    public void setPassword(ActionEvent event){
        try{
            if(txtPassword1.getText().equals(txtPassword2.getText())){
                forgetModel.setPassword(txtPassword1.getText(),current_user);

                passwordStatus.setText("Password has been change");
            }
            else {
                passwordStatus.setText("Passwords is not same");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }




}
