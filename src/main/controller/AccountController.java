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
import java.util.ResourceBundle;

public class AccountController implements Initializable{

    MainEmpModel mainEmpModel = new MainEmpModel();
    LoginController loginController = new LoginController();
    public static String current_user;



    @FXML
    private Label labId;
    @FXML
    private Label labUname;
    @FXML
    private Label labName;
    @FXML
    private Label labSname;
    @FXML
    private Label labRole;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        current_user = loginController.current_user();
        if (current_user==null){
            System.exit(1);
        }

        try {
            labId.setText(mainEmpModel.getId(current_user));
            labName.setText(mainEmpModel.getName(current_user));
            labUname.setText(current_user);
            labSname.setText(mainEmpModel.getSname(current_user));
            labRole.setText(mainEmpModel.getRole(current_user));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void reset(ActionEvent event) throws Exception {
        SetPassword setPassword = new SetPassword();
        setPassword.showWindow();
    }
    public void back(ActionEvent event) {
        Stage stage = (Stage) labId.getScene().getWindow();
        stage.close();
    }

}
