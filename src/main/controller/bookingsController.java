package main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import main.model.MainEmpModel;
import main.SetPassword;
import java.net.URL;
import java.sql.SQLException;
import java.util.Date;
import java.util.ResourceBundle;

public class bookingsController implements Initializable{

    MainEmpModel mainEmpModel = new MainEmpModel();
    LoginController loginController = new LoginController();
    public static String current_user;

    @FXML
    private Label txtDate;
    @FXML
    private Label txtSit;
    @FXML
    private Label txtStatus;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        current_user = loginController.current_user();
        if (current_user==null){
            System.exit(1);
        }

        try {
            int bsit = mainEmpModel.getBsid(Integer.parseInt(mainEmpModel.getId(current_user)));
            Date date = mainEmpModel.getBdate(Integer.parseInt(mainEmpModel.getId(current_user)));
            txtSit.setText(String.valueOf(bsit));
            txtDate.setText(date.toString());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void deleteBooking(ActionEvent event){
        txtStatus.setText("Canceled");
    }


    public void back(ActionEvent event) {
        Stage stage = (Stage) txtDate.getScene().getWindow();
        stage.close();
    }
}
