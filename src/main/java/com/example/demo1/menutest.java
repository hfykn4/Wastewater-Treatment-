package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class menutest extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Login.class.getResource("Menu-View.fxml"));
        FXMLLoader fxmlLoader2 = new FXMLLoader(Login.class.getResource("Menu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 542, 400);
        stage.setTitle("Wastewater Treatment Decision Making System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}