package com.example.healthcare.frontend;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Healthcare Data Management");

        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();

        Label conditionLabel = new Label("Condition:");
        TextField conditionField = new TextField();

        Button predictButton = new Button("Predict Outcome");
        Label resultLabel = new Label();

        predictButton.setOnAction(e -> {
            int age = Integer.parseInt(ageField.getText());
            String condition = conditionField.getText();
            try {
                String result = getPrediction(age, condition);
                resultLabel.setText(result);
            } catch (IOException ioException) {
                resultLabel.setText("Error fetching prediction");
            }
        });

        VBox vbox = new VBox(ageLabel, ageField, conditionLabel, conditionField, predictButton, resultLabel);
        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String getPrediction(int age, String condition) throws IOException {
        URL url = new URL("http://localhost:8080/predict?age=" + age + "&condition=" + condition);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        Scanner scanner = new Scanner(connection.getInputStream());
        StringBuilder result = new StringBuilder();
        while (scanner.hasNext()) {
            result.append(scanner.nextLine());
        }
        scanner.close();

        return result.toString();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
