package com.example.java2_lesson5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Alex Chat 1.0");
        stage.setScene(scene);
        stage.setX(100);
        stage.setY(100);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}