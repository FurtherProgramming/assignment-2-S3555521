package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Register extends Application {

    Stage stage=new Stage();

    @Override
    public void start(Stage secondStage) throws Exception{
        secondStage.setResizable(false);
        secondStage.setTitle("Register");
        Parent root = FXMLLoader.load(getClass().getResource("ui/register.fxml"));
        Scene scene = new Scene(root);
        secondStage.setScene(scene);
        secondStage.show();
    }

    public void showWindow() throws Exception {
        start(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
