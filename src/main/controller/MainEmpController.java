package main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import main.Account;
import main.model.MainEmpModel;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class MainEmpController implements Initializable {

    MainEmpModel mainEmpModel = new MainEmpModel();

    @FXML
    private Label status;
    @FXML
    private Label user;



    public static String current_user;
    LoginController loginController = new LoginController();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        current_user = loginController.current_user();
        user.setText(current_user);
        if (current_user==null){
            System.exit(1);
        }
    }




    public void account(ActionEvent event) throws Exception {
        Account account = new Account();
        account.showWindow();

    }
    public void choose(ActionEvent event) {

    }
    public void bookings(ActionEvent event) {

    }


}
