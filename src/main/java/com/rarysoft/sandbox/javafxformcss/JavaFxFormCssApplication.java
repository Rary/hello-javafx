package com.rarysoft.sandbox.javafxformcss;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFxFormCssApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Form");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text sceneTitle = new Text("Welcome");
        sceneTitle.setId("welcome-text");
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userNameField = new TextField();
        grid.add(userNameField, 1, 1);

        Label password = new Label("Password:");
        grid.add(password, 0, 2);

        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);

        Button button = new Button("Sign In");
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.getChildren().add(button);
        grid.add(hBox, 1, 4);

        final Text actionTarget = new Text();
        actionTarget.setId("action-target");
        grid.add(actionTarget, 1, 6);

        button.setOnAction(event -> {
            actionTarget.setFill(Color.FIREBRICK);
            actionTarget.setText("Sign in button pressed");
        });

        Scene scene = new Scene(grid, 300, 275);
        scene.getStylesheets().add(JavaFxFormCssApplication.class.getResource("styles/JavaFxFormCssApplication.css").toExternalForm());
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
