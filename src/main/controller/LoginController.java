package main.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import main.Admin;
import main.Employee;
import main.Forget;
import main.Register;
import main.model.LoginModel;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.stage.Stage;

public class LoginController implements Initializable {
    public LoginModel loginModel = new LoginModel();
    public static String current_user;

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
                current_user = txtUsername.getText();
                if(loginModel.isAdmin(txtUsername.getText())){
                    Admin admin = new Admin();
                    admin.showWindow();
                    Stage stage = (Stage) isConnected.getScene().getWindow();
                    stage.hide();

                }
                else {
                    Employee employee = new Employee();
                    employee.showWindow();
                    Stage stage = (Stage) isConnected.getScene().getWindow();
                    stage.hide();

                }


            } else {
                isConnected.setText("username and password is incorrect");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //register button
    public void Register(ActionEvent event) throws Exception {

        Register register = new Register();
        register.showWindow();

        //Stage stage = (Stage) isConnected.getScene().getWindow();
        //stage.close();



    }
    //forget password button
    public void Forget(ActionEvent event) throws Exception {

        Forget forget = new Forget();
        forget.showWindow();

    }
    //remember who is login
    public String current_user(){
        return current_user;
    }


}




    //11.2.3 big sur



