package com.byexpert.javafx.mvvmapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MvvmApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        EmploymentRequestView view = new EmploymentRequestView();
        Scene scene = new Scene(view, 480, 320);

        primaryStage.setTitle("MVVM App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
