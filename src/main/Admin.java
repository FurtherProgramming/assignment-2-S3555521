package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Admin extends Application{
    Stage stage=new Stage();
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setResizable(false);
        primaryStage.setTitle("Admin");
        Parent root = FXMLLoader.load(getClass().getResource("ui/mainAdm.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void showWindow() throws Exception {
        start(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
