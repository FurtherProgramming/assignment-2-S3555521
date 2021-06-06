package main.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class MainAdmController implements Initializable {
    @FXML
    private Label status;

    public static String current_user;
    LoginController loginController = new LoginController();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        current_user = loginController.current_user();
        status.setText(current_user);
    }


}
