package main.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Paint;
import main.Sit;
import main.model.MainAdmModel;
import main.model.RegisterModel;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
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
    @FXML
    private DatePicker bDatepicker;
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
    private ComboBox bid;
    @FXML
    private ComboBox sits;
    @FXML
    private DatePicker wDatepicker;
    @FXML
    private CheckBox ba;




    public static String current_user;
    public static int selected_sit;
    public static Date date;
    LoginController loginController = new LoginController();
    MainAdmModel mainAdmModel = new MainAdmModel();
    RegisterModel registerModel = new RegisterModel();

    BackgroundFill backgroundFillGreen = new BackgroundFill(Paint.valueOf("#8FBC8F"), CornerRadii.EMPTY, Insets.EMPTY);
    Background backgroundGreen = new Background(backgroundFillGreen);
    BackgroundFill backgroundFillRed = new BackgroundFill(Paint.valueOf("#FF4000"), CornerRadii.EMPTY, Insets.EMPTY);
    Background getBackgroundRed = new Background(backgroundFillRed);
    BackgroundFill backgroundFillYellow = new BackgroundFill(Paint.valueOf("#FFFF00"), CornerRadii.EMPTY, Insets.EMPTY);
    Background getBackgroundYellow = new Background(backgroundFillYellow);

    //disable all the sit button
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        current_user = loginController.current_user();
        user.setText(current_user);
        if (current_user==null){
            System.exit(1);
        }
        try {
            fill();
            fillB();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
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


    //choose the user and show the information
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

    //choose the date and show the information, if null then create new one
    public void dChoose(ActionEvent event) throws SQLException {
        Date date = java.sql.Date.valueOf(bDatepicker.getValue());
        if(mainAdmModel.isBooking(date))
            refresh();
        else {
            mainAdmModel.createBooking(date);
            refresh();
        }

    }
    //create new employee
    public void create(ActionEvent event) throws SQLException {
        mainAdmModel.create(Integer.parseInt(id.getText()),fName.getText(),lName.getText(),role.getValue().toString(),uName.getText(),password.getText(),question.getValue().toString(),answer.getText(),admin.isSelected());
        registerModel.toBlacklist(Integer.parseInt(id.getText()));
        fill();
    }
    //update the information of employee
    public void update(ActionEvent event) throws SQLException {
        mainAdmModel.update(Integer.parseInt(id.getText()),fName.getText(),lName.getText(),role.getValue().toString(),uName.getText(),password.getText(),question.getValue().toString(),answer.getText(),admin.isSelected());

    }
    //delete employee
    public void delete(ActionEvent event) throws SQLException {
        mainAdmModel.delete(Integer.parseInt(id.getText()));
        mainAdmModel.deleteBlacklist(Integer.parseInt(id.getText()));
        fill();
    }
    //release booking
    public void release(ActionEvent event) throws SQLException {
        Date date2 = java.sql.Date.valueOf(bDatepicker.getValue());
        int s1 = mainAdmModel.getS1(date2);
        int s2 = mainAdmModel.getS2(date2);
        int s3 = mainAdmModel.getS3(date2);
        int s4 = mainAdmModel.getS4(date2);
        int s5 = mainAdmModel.getS5(date2);
        int s6 = mainAdmModel.getS6(date2);
        int s7 = mainAdmModel.getS7(date2);
        int s8 = mainAdmModel.getS8(date2);
        int s9 = mainAdmModel.getS9(date2);
        int s10 = mainAdmModel.getS10(date2);
        int s11 = mainAdmModel.getS11(date2);
        int s12 = mainAdmModel.getS12(date2);
        int s13 = mainAdmModel.getS13(date2);
        int s14 = mainAdmModel.getS14(date2);
        int s15 = mainAdmModel.getS15(date2);
        int s16 = mainAdmModel.getS16(date2);
        mainAdmModel.createRelease(date2,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16);


    }
    //fill with the userid
    public void fill() throws SQLException {
        ObservableList olist = FXCollections.observableArrayList();
        ArrayList list;
        list = mainAdmModel.getUsers();
        for(int i = 0; i<list.size(); i++){
            olist.add(list.get(i));
        }
        users.setItems(olist);
    }
    //fill with the blacklist userid
    public void fillB() throws SQLException {
        ObservableList olist = FXCollections.observableArrayList();
        ArrayList list;
        list = mainAdmModel.getBids();
        for(int i = 0; i<list.size(); i++){
            olist.add(list.get(i));
        }
        bid.setItems(olist);
    }
    //sit button
    public void b1(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 1;
        openSit();

    }
    public void b2(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 2;
        openSit();


    }
    public void b3(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 3;
        openSit();

    }
    public void b4(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 4;
        openSit();

    }
    public void b5(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 5;
        openSit();

    }
    public void b6(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 6;
        openSit();
    }
    public void b7(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 7;
        openSit();
    }
    public void b8(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 8;
        openSit();

    }
    public void b9(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 9;
        openSit();
    }
    public void b10(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 10;
        openSit();

    }
    public void b11(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 11;
        openSit();
    }
    public void b12(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 12;
        openSit();

    }
    public void b13(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 13;
        openSit();
    }
    public void b14(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 14;
        openSit();

    }
    public void b15(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 15;
        openSit();

    }
    public void b16(ActionEvent event) throws Exception {
        date = java.sql.Date.valueOf(bDatepicker.getValue());
        selected_sit = 16;
        openSit();
    }
    //open a new window to edit the booking
    public void openSit() throws Exception {
        Sit sit = new Sit();
        sit.showWindow();

    }

    public int getSit(){
        return selected_sit;
    }
    public Date getDate(){
        return date;
    }
    //refresh the sit button
    public void refresh() throws SQLException {
        Date date1 = java.sql.Date.valueOf(bDatepicker.getValue());
        status.setText(date1.toString());
        int n1 = mainAdmModel.getS1(date1);
        int n2 = mainAdmModel.getS2(date1);
        int n3 = mainAdmModel.getS3(date1);
        int n4 = mainAdmModel.getS4(date1);
        int n5 = mainAdmModel.getS5(date1);
        int n6 = mainAdmModel.getS6(date1);
        int n7 = mainAdmModel.getS7(date1);
        int n8 = mainAdmModel.getS8(date1);
        int n9 = mainAdmModel.getS9(date1);
        int n10 = mainAdmModel.getS10(date1);
        int n11 = mainAdmModel.getS11(date1);
        int n12 = mainAdmModel.getS12(date1);
        int n13 = mainAdmModel.getS13(date1);
        int n14 = mainAdmModel.getS14(date1);
        int n15 = mainAdmModel.getS15(date1);
        int n16 = mainAdmModel.getS16(date1);
        if(n1==0){
            s1.setDisable(false);
            s1.setBackground(backgroundGreen);
        }else if(n1==99){
            s1.setDisable(false);
            s1.setBackground(getBackgroundYellow);
        }else {
            s1.setDisable(false);
            s1.setBackground(getBackgroundRed);
        }

        if(n2==0){
            s2.setDisable(false);
            s2.setBackground(backgroundGreen);
        }else if(n2==99){
            s2.setDisable(false);
            s2.setBackground(getBackgroundYellow);
        }else {
            s2.setDisable(false);
            s2.setBackground(getBackgroundRed);
        }

        if(n3==0){
            s3.setDisable(false);
            s3.setBackground(backgroundGreen);
        }else if(n3==99){
            s3.setDisable(false);
            s3.setBackground(getBackgroundYellow);
        }else {
            s3.setDisable(false);
            s3.setBackground(getBackgroundRed);
        }

        if(n4==0){
            s4.setDisable(false);
            s4.setBackground(backgroundGreen);
        }else if(n4==99){
            s4.setDisable(false);
            s4.setBackground(getBackgroundYellow);
        }else {
            s4.setDisable(false);
            s4.setBackground(getBackgroundRed);
        }

        if(n5==0){
            s5.setDisable(false);
            s5.setBackground(backgroundGreen);
        }else if(n5==99){
            s5.setDisable(false);
            s5.setBackground(getBackgroundYellow);
        }else {
            s5.setDisable(false);
            s5.setBackground(getBackgroundRed);
        }

        if(n6==0){
            s6.setDisable(false);
            s6.setBackground(backgroundGreen);
        }else if(n6==99){
            s6.setDisable(false);
            s6.setBackground(getBackgroundYellow);
        }else {
            s6.setDisable(false);
            s6.setBackground(getBackgroundRed);
        }

        if(n7==0){
            s7.setDisable(false);
            s7.setBackground(backgroundGreen);
        }else if(n7==99){
            s7.setDisable(false);
            s7.setBackground(getBackgroundYellow);
        }else {
            s7.setDisable(false);
            s7.setBackground(getBackgroundRed);
        }

        if(n8==0){
            s8.setDisable(false);
            s8.setBackground(backgroundGreen);
        }else if(n8==99){
            s8.setDisable(false);
            s8.setBackground(getBackgroundYellow);
        }else {
            s8.setDisable(false);
            s8.setBackground(getBackgroundRed);
        }

        if(n9==0){
            s9.setDisable(false);
            s9.setBackground(backgroundGreen);
        }else if(n9==99){
            s9.setDisable(false);
            s9.setBackground(getBackgroundYellow);
        }else {
            s9.setDisable(false);
            s9.setBackground(getBackgroundRed);
        }

        if(n10==0){
            s10.setDisable(false);
            s10.setBackground(backgroundGreen);
        }else if(n10==99){
            s10.setDisable(false);
            s10.setBackground(getBackgroundYellow);
        }else {
            s10.setDisable(false);
            s10.setBackground(getBackgroundRed);
        }

        if(n11==0){
            s11.setDisable(false);
            s11.setBackground(backgroundGreen);
        }else if(n11==99){
            s11.setDisable(false);
            s11.setBackground(getBackgroundYellow);
        }else {
            s11.setDisable(false);
            s11.setBackground(getBackgroundRed);
        }

        if(n12==0){
            s12.setDisable(false);
            s12.setBackground(backgroundGreen);
        }else if(n12==99){
            s12.setDisable(false);
            s12.setBackground(getBackgroundYellow);
        }else {
            s12.setDisable(false);
            s12.setBackground(getBackgroundRed);
        }

        if(n13==0){
            s13.setDisable(false);
            s13.setBackground(backgroundGreen);
        }else if(n13==99){
            s13.setDisable(false);
            s13.setBackground(getBackgroundYellow);
        }else {
            s13.setDisable(false);
            s13.setBackground(getBackgroundRed);
        }

        if(n14==0){
            s14.setDisable(false);
            s14.setBackground(backgroundGreen);
        }else if(n14==99){
            s14.setDisable(false);
            s14.setBackground(getBackgroundYellow);
        }else {
            s14.setDisable(false);
            s14.setBackground(getBackgroundRed);
        }

        if(n15==0){
            s15.setDisable(false);
            s15.setBackground(backgroundGreen);
        }else if(n15==99){
            s15.setDisable(false);
            s15.setBackground(getBackgroundYellow);
        }else {
            s15.setDisable(false);
            s15.setBackground(getBackgroundRed);
        }

        if(n16==0){
            s16.setDisable(false);
            s16.setBackground(backgroundGreen);
        }else if(n16==99){
            s16.setDisable(false);
            s16.setBackground(getBackgroundYellow);
        }else {
            s16.setDisable(false);
            s16.setBackground(getBackgroundRed);
        }

    }
    //blacklist userid select
    public void bSelect(ActionEvent event) throws SQLException {
        int blacklistID = Integer.parseInt(bid.getValue().toString());
        sits.setValue(mainAdmModel.getBsid(blacklistID));
        wDatepicker.setValue(mainAdmModel.getBdate(blacklistID).toLocalDate());
        ba.setSelected(mainAdmModel.getAvailable(blacklistID));

    }
    //blacklist update
    public void bUpdate(ActionEvent event) throws SQLException {
        int blacklistID = Integer.parseInt(bid.getValue().toString());
        mainAdmModel.blacklistUpdate(blacklistID,java.sql.Date.valueOf(wDatepicker.getValue()),Integer.parseInt(sits.getValue().toString()),ba.isSelected());

    }
    //new csv for employee
    public void employeeList(ActionEvent event) throws SQLException, IOException {
        mainAdmModel.employeeList();
        status.setText("success");
    }
    //new csv for released booking
    public void releaseList(ActionEvent event) throws SQLException, IOException {
        mainAdmModel.releaseList();
        status.setText("success");
    }




}
