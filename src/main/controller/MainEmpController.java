package main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import main.Account;
import main.model.MainEmpModel;

import java.sql.Date;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;


public class MainEmpController implements Initializable {
    
    @FXML
    private Label status;
    @FXML
    private Label user;
    @FXML
    private Button s1;
    @FXML
    private Button s2;
    @FXML
    private Button s3;
    @FXML
    private Button s4;
    @FXML
    private Button s5;
    @FXML
    private Button s6;
    @FXML
    private Button s7;
    @FXML
    private Button s8;
    @FXML
    private Button s9;
    @FXML
    private Button s10;
    @FXML
    private Button s11;
    @FXML
    private Button s12;
    @FXML
    private Button s13;
    @FXML
    private Button s14;
    @FXML
    private Button s15;
    @FXML
    private Button s16;
    @FXML
    private DatePicker datepicker;



    BackgroundFill backgroundFillGreen = new BackgroundFill(Paint.valueOf("#8FBC8F"), CornerRadii.EMPTY, Insets.EMPTY);
    Background backgroundGreen = new Background(backgroundFillGreen);
    BackgroundFill backgroundFillRed = new BackgroundFill(Paint.valueOf("#FF4000"), CornerRadii.EMPTY, Insets.EMPTY);
    Background getBackgroundRed = new Background(backgroundFillRed);
    BackgroundFill backgroundFillYellow = new BackgroundFill(Paint.valueOf("#FFFF00"), CornerRadii.EMPTY, Insets.EMPTY);
    Background getBackgroundYellow = new Background(backgroundFillYellow);


    public static String current_user;
    LoginController loginController = new LoginController();
    MainEmpModel mainEmpModel = new MainEmpModel();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        current_user = loginController.current_user();
        user.setText(current_user);
        if (current_user==null){
            System.exit(1);
        }
        s1.setDisable(true);
        s2.setDisable(true);
        s3.setDisable(true);
        s4.setDisable(true);
        s5.setDisable(true);
        s6.setDisable(true);
        s7.setDisable(true);
        s8.setDisable(true);
        s9.setDisable(true);
        s10.setDisable(true);
        s11.setDisable(true);
        s12.setDisable(true);
        s13.setDisable(true);
        s14.setDisable(true);
        s15.setDisable(true);
        s16.setDisable(true);

    }




    public void account(ActionEvent event) throws Exception {
        Account account = new Account();
        account.showWindow();

    }
    public void choose(ActionEvent event) throws SQLException {
        Date date = java.sql.Date.valueOf(datepicker.getValue());
        if(mainEmpModel.isBooking(date))
        refresh();
        else {
            mainEmpModel.createBooking(date);
            refresh();
        }
    }
    public void bookings(ActionEvent event) throws SQLException {
        Date date = java.sql.Date.valueOf(datepicker.getValue());

    }
    public void b1(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),1);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }
    }
    public void b2(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),2);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }


    }
    public void b3(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),3);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }

    }
    public void b4(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),4);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }

    }
    public void b5(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),5);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }

    }
    public void b6(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),6);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }

    }
    public void b7(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),7);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }

    }
    public void b8(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),8);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }

    }
    public void b9(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),9);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }

    }
    public void b10(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),10);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }

    }
    public void b11(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),11);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }

    }
    public void b12(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),12);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }

    }
    public void b13(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),13);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }

    }
    public void b14(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),14);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }

    }
    public void b15(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),15);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }

    }
    public void b16(ActionEvent event) throws SQLException {
        if(mainEmpModel.canBooking(Integer.parseInt(mainEmpModel.getId(current_user)))) {
            Date date = java.sql.Date.valueOf(datepicker.getValue());
            mainEmpModel.bookingS1(date, Integer.parseInt(mainEmpModel.getId(current_user)));
            mainEmpModel.toBlacklist(date,Integer.parseInt(mainEmpModel.getId(current_user)),16);
            refresh();
            status.setText("Success");
        }else {
            status.setText("You have a booking already");
        }

    }

    public void refresh() throws SQLException {
        Date date = java.sql.Date.valueOf(datepicker.getValue());
        status.setText(date.toString());
        int n1 = mainEmpModel.getS1(date);
        int n2 = mainEmpModel.getS2(date);
        int n3 = mainEmpModel.getS3(date);
        int n4 = mainEmpModel.getS4(date);
        int n5 = mainEmpModel.getS5(date);
        int n6 = mainEmpModel.getS6(date);
        int n7 = mainEmpModel.getS7(date);
        int n8 = mainEmpModel.getS8(date);
        int n9 = mainEmpModel.getS9(date);
        int n10 = mainEmpModel.getS10(date);
        int n11 = mainEmpModel.getS11(date);
        int n12 = mainEmpModel.getS12(date);
        int n13 = mainEmpModel.getS13(date);
        int n14 = mainEmpModel.getS14(date);
        int n15 = mainEmpModel.getS15(date);
        int n16 = mainEmpModel.getS16(date);

        if(n1==0){
            s1.setDisable(false);
            s1.setBackground(backgroundGreen);
        }else if(n1==99){
            s1.setDisable(true);
            s1.setBackground(getBackgroundYellow);
        }else {
            s1.setDisable(true);
            s1.setBackground(getBackgroundRed);
        }

        if(n2==0){
            s2.setDisable(false);
            s2.setBackground(backgroundGreen);
        }else if(n2==99){
            s2.setDisable(true);
            s2.setBackground(getBackgroundYellow);
        }else {
            s2.setDisable(true);
            s2.setBackground(getBackgroundRed);
        }

        if(n3==0){
            s3.setDisable(false);
            s3.setBackground(backgroundGreen);
        }else if(n3==99){
            s3.setDisable(true);
            s3.setBackground(getBackgroundYellow);
        }else {
            s3.setDisable(true);
            s3.setBackground(getBackgroundRed);
        }

        if(n4==0){
            s4.setDisable(false);
            s4.setBackground(backgroundGreen);
        }else if(n4==99){
            s4.setDisable(true);
            s4.setBackground(getBackgroundYellow);
        }else {
            s4.setDisable(true);
            s4.setBackground(getBackgroundRed);
        }

        if(n5==0){
            s5.setDisable(false);
            s5.setBackground(backgroundGreen);
        }else if(n5==99){
            s5.setDisable(true);
            s5.setBackground(getBackgroundYellow);
        }else {
            s5.setDisable(true);
            s5.setBackground(getBackgroundRed);
        }

        if(n6==0){
            s6.setDisable(false);
            s6.setBackground(backgroundGreen);
        }else if(n6==99){
            s6.setDisable(true);
            s6.setBackground(getBackgroundYellow);
        }else {
            s6.setDisable(true);
            s6.setBackground(getBackgroundRed);
        }

        if(n7==0){
            s7.setDisable(false);
            s7.setBackground(backgroundGreen);
        }else if(n7==99){
            s7.setDisable(true);
            s7.setBackground(getBackgroundYellow);
        }else {
            s7.setDisable(true);
            s7.setBackground(getBackgroundRed);
        }

        if(n8==0){
            s8.setDisable(false);
            s8.setBackground(backgroundGreen);
        }else if(n8==99){
            s8.setDisable(true);
            s8.setBackground(getBackgroundYellow);
        }else {
            s8.setDisable(true);
            s8.setBackground(getBackgroundRed);
        }

        if(n9==0){
            s9.setDisable(false);
            s9.setBackground(backgroundGreen);
        }else if(n9==99){
            s9.setDisable(true);
            s9.setBackground(getBackgroundYellow);
        }else {
            s9.setDisable(true);
            s9.setBackground(getBackgroundRed);
        }

        if(n10==0){
            s10.setDisable(false);
            s10.setBackground(backgroundGreen);
        }else if(n10==99){
            s10.setDisable(true);
            s10.setBackground(getBackgroundYellow);
        }else {
            s10.setDisable(true);
            s10.setBackground(getBackgroundRed);
        }

        if(n11==0){
            s11.setDisable(false);
            s11.setBackground(backgroundGreen);
        }else if(n11==99){
            s11.setDisable(true);
            s11.setBackground(getBackgroundYellow);
        }else {
            s11.setDisable(true);
            s11.setBackground(getBackgroundRed);
        }

        if(n12==0){
            s12.setDisable(false);
            s12.setBackground(backgroundGreen);
        }else if(n12==99){
            s12.setDisable(true);
            s12.setBackground(getBackgroundYellow);
        }else {
            s12.setDisable(true);
            s12.setBackground(getBackgroundRed);
        }

        if(n13==0){
            s13.setDisable(false);
            s13.setBackground(backgroundGreen);
        }else if(n13==99){
            s13.setDisable(true);
            s13.setBackground(getBackgroundYellow);
        }else {
            s13.setDisable(true);
            s13.setBackground(getBackgroundRed);
        }

        if(n14==0){
            s14.setDisable(false);
            s14.setBackground(backgroundGreen);
        }else if(n14==99){
            s14.setDisable(true);
            s14.setBackground(getBackgroundYellow);
        }else {
            s14.setDisable(true);
            s14.setBackground(getBackgroundRed);
        }

        if(n15==0){
            s15.setDisable(false);
            s15.setBackground(backgroundGreen);
        }else if(n15==99){
            s15.setDisable(true);
            s15.setBackground(getBackgroundYellow);
        }else {
            s15.setDisable(true);
            s15.setBackground(getBackgroundRed);
        }

        if(n16==0){
            s16.setDisable(false);
            s16.setBackground(backgroundGreen);
        }else if(n16==99){
            s16.setDisable(true);
            s16.setBackground(getBackgroundYellow);
        }else {
            s16.setDisable(true);
            s16.setBackground(getBackgroundRed);
        }



    }


}
