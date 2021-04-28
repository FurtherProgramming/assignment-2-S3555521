package main.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import main.model.LoginModel;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {

    @FXML
    private TextField txtFname;
    @FXML
    private TextField txtLname;
    @FXML
    private TextField txtUname;
    @FXML
    private TextField txtEm_id;
    @FXML
    private ChoiceBox txtRole;
    @FXML
    private PasswordField txtPassword1;
    @FXML
    private PasswordField txtPassword2;
    @FXML
    private ChoiceBox txtQuestion;

    private String fName;
    private String lName;
    private String uName;
    private int em_id;
    private String role;
    private String qunestion;
    private String password1;
    private String password2;


    public void initialize(URL location, ResourceBundle resources) {
    }

    public void Register(ActionEvent Register) {
        fName = txtFname.getText();
        lName = txtLname.getText();
        uName = txtUname.getText();
        em_id = Integer.parseInt(txtEm_id.getText());
        password1 = txtPassword1.getText();
        password2 = txtPassword2.getText();
        //role=txtRole.get
        //question=txtQunestion.get


    }
}

