package com.byexpert.javafx.modelchangeapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ModelChangeApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        URLTestView view = new URLTestView();
        Scene scene = new Scene(view, 480, 320);

        primaryStage.setTitle("Model Change App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
