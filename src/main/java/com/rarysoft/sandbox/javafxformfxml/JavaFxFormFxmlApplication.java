package com.rarysoft.sandbox.javafxformfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFxFormFxmlApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/JavaFxFormFxmlApplication.fxml"));

        Scene scene = new Scene(root, 300, 275);

        primaryStage.setTitle("JavaFX Form FXML");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
