package com.rarysoft.sandbox.hellojavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloJavaFxApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello JavaFX World!");
        StackPane root = new StackPane();
        Label label = new Label("Hello JavaFX World!");
        root.getChildren().add(label);
        primaryStage.setScene(new Scene(root, 640, 480));
        primaryStage.show();
    }
}
