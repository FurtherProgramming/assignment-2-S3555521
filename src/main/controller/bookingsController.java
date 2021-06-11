package main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import main.model.MainAdmModel;
import main.model.MainEmpModel;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ResourceBundle;

public class bookingsController implements Initializable{

    MainEmpModel mainEmpModel = new MainEmpModel();
    MainAdmModel mainAdmModel = new MainAdmModel();
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
        //check the blacklist
        try {
            int bsit = mainEmpModel.getBsid(Integer.parseInt(mainEmpModel.getId(current_user)));
            Date date = mainEmpModel.getBdate(Integer.parseInt(mainEmpModel.getId(current_user)));
            txtSit.setText(String.valueOf(bsit));
            txtDate.setText(date.toString());
            if(mainEmpModel.isReleaseDate(date)){
                if(bsit==1){
                    if(mainEmpModel.isReleaseS1(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
                if(bsit==2){
                    if(mainEmpModel.isReleaseS2(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
                if(bsit==3){
                    if(mainEmpModel.isReleaseS3(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
                if(bsit==4){
                    if(mainEmpModel.isReleaseS4(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
                if(bsit==5){
                    if(mainEmpModel.isReleaseS5(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
                if(bsit==6){
                    if(mainEmpModel.isReleaseS6(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
                if(bsit==7){
                    if(mainEmpModel.isReleaseS7(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
                if(bsit==8){
                    if(mainEmpModel.isReleaseS8(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
                if(bsit==9){
                    if(mainEmpModel.isReleaseS9(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
                if(bsit==10){
                    if(mainEmpModel.isReleaseS10(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
                if(bsit==11){
                    if(mainEmpModel.isReleaseS11(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
                if(bsit==12){
                    if(mainEmpModel.isReleaseS12(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
                if(bsit==13){
                    if(mainEmpModel.isReleaseS13(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
                if(bsit==14){
                    if(mainEmpModel.isReleaseS14(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
                if(bsit==15){
                    if(mainEmpModel.isReleaseS15(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
                if(bsit==16){
                    if(mainEmpModel.isReleaseS16(date,Integer.parseInt(mainEmpModel.getId(current_user)))){
                        txtStatus.setText("accept");
                    }else{
                        txtStatus.setText("reject");
                    }
                }
            }else {
                txtStatus.setText("processing");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //delete bookings
    public void deleteBooking(ActionEvent event) throws SQLException {
        int bsit = mainEmpModel.getBsid(Integer.parseInt(mainEmpModel.getId(current_user)));
        Date date = mainEmpModel.getBdate(Integer.parseInt(mainEmpModel.getId(current_user)));
        if(bsit==1){
            mainAdmModel.cancelS1(date);
        }
        if(bsit==2){
            mainAdmModel.cancelS2(date);
        }
        if(bsit==3){
            mainAdmModel.cancelS3(date);
        }
        if(bsit==4){
            mainAdmModel.cancelS4(date);
        }
        if(bsit==5){
            mainAdmModel.cancelS5(date);
        }
        if(bsit==6){
            mainAdmModel.cancelS6(date);
        }
        if(bsit==7){
            mainAdmModel.cancelS7(date);
        }
        if(bsit==8){
            mainAdmModel.cancelS8(date);
        }
        if(bsit==9){
            mainAdmModel.cancelS9(date);
        }
        if(bsit==10){
            mainAdmModel.cancelS10(date);
        }
        if(bsit==11){
            mainAdmModel.cancelS11(date);
        }
        if(bsit==12){
            mainAdmModel.cancelS12(date);
        }
        if(bsit==13){
            mainAdmModel.cancelS13(date);
        }
        if(bsit==14){
            mainAdmModel.cancelS14(date);
        }
        if(bsit==15){
            mainAdmModel.cancelS15(date);
        }
        if(bsit==16){
            mainAdmModel.cancelS16(date);
        }
        mainEmpModel.toIsBookings(Integer.parseInt(mainEmpModel.getId(current_user)),true);
        txtStatus.setText("Deleted");
    }

    //go back
    public void back(ActionEvent event) {
        Stage stage = (Stage) txtDate.getScene().getWindow();
        stage.close();
    }
}
