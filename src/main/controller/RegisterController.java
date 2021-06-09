package main.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import main.model.RegisterModel;
import javafx.stage.Stage;

import java.net.URL;
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
    private ComboBox txtRole;
    @FXML
    private PasswordField txtPassword1;
    @FXML
    private PasswordField txtPassword2;
    @FXML
    private ComboBox txtQuestion;
    @FXML
    private TextField txtAnswer;
    @FXML
    private Label status;

    private String fName;
    private String lName;
    private String uName;
    private int em_id;
    private String role;
    private String question;
    private String password1;
    private String password2;
    private String answer;

    public RegisterModel registerModel = new RegisterModel();


    public void initialize(URL location, ResourceBundle resources) {
    }

    public void Register(ActionEvent Register) {
        fName = txtFname.getText();
        lName = txtLname.getText();
        uName = txtUname.getText();
        em_id = Integer.parseInt(txtEm_id.getText());
        password1 = txtPassword1.getText();
        password2 = txtPassword2.getText();
        role = txtRole.getValue().toString();
        question = txtQuestion.getValue().toString();
        answer = txtAnswer.getText();

        if (fName == null || lName == null || uName == null || em_id == 0 || password1 == null || password2 == null || answer == null) {
            status.setText("There can not be blanks");

        } else {
            if (password1.equals(password2)) {
                registerModel.toRegister(em_id, fName, lName, role, uName, password1, question, answer);
                registerModel.toBlacklist(em_id);
                status.setText("Success!");
            }
            else {
                status.setText("Passwords are not same");
            }
        }
    }
    public void Back(ActionEvent Register) {
        Stage stage = (Stage) status.getScene().getWindow();
        stage.close();

    }

}

