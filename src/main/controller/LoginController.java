package main.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import main.Register;
import main.model.LoginModel;
import javafx.stage.Stage;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public LoginModel loginModel = new LoginModel();
    @FXML
    private Label isConnected;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;


    // Check database connection
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (loginModel.isDbConnected()) {
            isConnected.setText("Connected");
        } else {
            isConnected.setText("Not Connected");
        }

    }

    /* login Action method
       check if user input is the same as database.
     */
    public void Login(ActionEvent event) {

        try {
            if (loginModel.isLogin(txtUsername.getText(), txtPassword.getText())) {

                isConnected.setText("Logged in successfully");

            } else {
                isConnected.setText("username and password is incorrect");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void Register(ActionEvent event) throws Exception {

        Register register = new Register();
        register.showWindow();

        //Stage stage = (Stage) isConnected.getScene().getWindow();
        //stage.close();



    }

    public void Forget(ActionEvent event) throws Exception {


    }




}




    //11.2.3 big sur



