package main.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import main.model.MainAdmModel;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ResourceBundle;

public class MainAdmController implements Initializable {
    @FXML
    private Label status;
    @FXML
    private Label user;
    @FXML
    private TextField id;
    @FXML
    private TextField fName;
    @FXML
    private TextField lName;
    @FXML
    private ComboBox role;
    @FXML
    private TextField uName;
    @FXML
    private TextField password;
    @FXML
    private ComboBox question;
    @FXML
    private TextField answer;
    @FXML
    private ComboBox users;
    @FXML
    private CheckBox admin;



    public static String current_user;
    LoginController loginController = new LoginController();
    MainAdmModel mainAdmModel = new MainAdmModel();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        current_user = loginController.current_user();
        user.setText(current_user);
        if (current_user==null){
            System.exit(1);
        }
        try {
            fill();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }



    public void uChoose(ActionEvent event) throws SQLException {
        String username = mainAdmModel.getUname(Integer.parseInt(users.getValue().toString()));
        id.setText(mainAdmModel.getId(username));
        fName.setText(mainAdmModel.getName(username));
        lName.setText(mainAdmModel.getSname(username));
        role.setValue(mainAdmModel.getRole(username));
        uName.setText(username);
        password.setText(mainAdmModel.getPassword(username));
        question.setValue(mainAdmModel.getQuestion(username));
        answer.setText((mainAdmModel.getAnswer(username)));
        admin.setSelected(mainAdmModel.getAdmin(username));
    }


    public void dChoose(ActionEvent event){

    }

    public void create(ActionEvent event) throws SQLException {
        mainAdmModel.create(Integer.parseInt(id.getText()),fName.getText(),lName.getText(),role.getValue().toString(),uName.getText(),password.getText(),question.getValue().toString(),answer.getText(),admin.isSelected());
        fill();
    }

    public void update(ActionEvent event) throws SQLException {
        mainAdmModel.update(Integer.parseInt(id.getText()),fName.getText(),lName.getText(),role.getValue().toString(),uName.getText(),password.getText(),question.getValue().toString(),answer.getText(),admin.isSelected());

    }

    public void delete(ActionEvent event) throws SQLException {
        mainAdmModel.delete(Integer.parseInt(id.getText()));
        fill();
    }

    public void covid(ActionEvent event){

    }

    public void fill() throws SQLException {
        ObservableList olist = FXCollections.observableArrayList();
        ArrayList list;
        list = mainAdmModel.getUsers();
        for(int i = 0; i<list.size(); i++){
            olist.add(list.get(i));
        }
        users.setItems(olist);
    }



}
