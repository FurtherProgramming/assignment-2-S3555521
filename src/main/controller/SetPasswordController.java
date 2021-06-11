package main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import main.model.SetPasswordModel;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SetPasswordController implements Initializable {

    @FXML
    private Label passwordStatus;
    @FXML
    private TextField txtPassword1;
    @FXML
    private TextField txtPassword2;

    LoginController loginController = new LoginController();
    ForgetController forgetController= new ForgetController();
    SetPasswordModel setPassword = new SetPasswordModel();
    public static String current_user;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        current_user = loginController.current_user();
        if(current_user==null){
            current_user = forgetController.now_user();
        }
    }
    //update the password to employee
    public void setPassword(ActionEvent event){
        try{
            if(txtPassword1.getText().equals(txtPassword2.getText())){
                setPassword.setPassword(txtPassword1.getText(),current_user);

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
