package main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import main.model.MainAdmModel;

import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SitController  implements Initializable {

    MainAdmController mainAdmController = new MainAdmController();
    MainAdmModel mainAdmModel = new MainAdmModel();
    private static Date date;
    private static int sit;
    @FXML
    private Button b1;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sit = mainAdmController.getSit();
        date = mainAdmController.getDate();

    }
    //for cancel the bookings, in admin
    public void cancel(ActionEvent event) throws SQLException {
        if(sit == 1) {
            mainAdmModel.cancelS1(date);
        }
        if(sit == 2) {
            mainAdmModel.cancelS2(date);
        }
        if(sit == 3) {
            mainAdmModel.cancelS3(date);
        }
        if(sit == 4) {
            mainAdmModel.cancelS4(date);
        }
        if(sit == 5) {
            mainAdmModel.cancelS5(date);
        }
        if(sit == 6) {
            mainAdmModel.cancelS6(date);
        }
        if(sit == 7){
            mainAdmModel.cancelS7(date);
        }
        if(sit == 8){
            mainAdmModel.cancelS8(date);
        }
        if(sit == 9){
            mainAdmModel.cancelS9(date);
        }
        if(sit == 10){
            mainAdmModel.cancelS10(date);
        }
        if(sit == 11){
            mainAdmModel.cancelS11(date);
        }
        if(sit == 12){
            mainAdmModel.cancelS12(date);
        }
        if(sit == 13){
            mainAdmModel.cancelS13(date);
        }
        if(sit == 14){
            mainAdmModel.cancelS14(date);
        }
        if(sit == 15){
            mainAdmModel.cancelS15(date);
        }
        if(sit == 16){
            mainAdmModel.cancelS16(date);
        }
        back();

    }
    //for lock the sit, in admin
    public void lock(ActionEvent event) throws SQLException {
        if(sit == 1){
            mainAdmModel.lockS1(date);
        }
        if(sit == 2){
            mainAdmModel.lockS2(date);
        }
        if(sit == 3){
            mainAdmModel.lockS3(date);
        }
        if(sit == 4){
            mainAdmModel.lockS4(date);
        }
        if(sit == 5){
            mainAdmModel.lockS5(date);
        }
        if(sit == 6){
            mainAdmModel.lockS6(date);
        }
        if(sit == 7){
            mainAdmModel.lockS7(date);
        }
        if(sit == 8){
            mainAdmModel.lockS8(date);
        }
        if(sit == 9){
            mainAdmModel.lockS9(date);
        }
        if(sit == 10){
            mainAdmModel.lockS10(date);
        }
        if(sit == 11){
            mainAdmModel.lockS11(date);
        }
        if(sit == 12){
            mainAdmModel.lockS12(date);
        }
        if(sit == 13){
            mainAdmModel.lockS13(date);
        }
        if(sit == 14){
            mainAdmModel.lockS14(date);
        }
        if(sit == 15){
            mainAdmModel.lockS15(date);
        }
        if(sit == 16){
            mainAdmModel.lockS16(date);
        }
        back();

    }

    public void back(){
        Stage stage = (Stage) b1.getScene().getWindow();
        stage.close();
    }

}
