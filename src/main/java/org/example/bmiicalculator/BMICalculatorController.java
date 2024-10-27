package org.example.bmiicalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMICalculatorController {

    @FXML
    private TextField heightField;

    @FXML
    private TextField weightField;

    @FXML
    private Label bmiResultLabel;

    @FXML
    private void calculateBMI() {
        try {
            double height = Double.parseDouble(heightField.getText());
            double weight = Double.parseDouble(weightField.getText());
            double bmi = weight / (height * height);
            bmiResultLabel.setText(String.format("%.2f", bmi));
        } catch (NumberFormatException ex) {
            bmiResultLabel.setText("Invalid input");
        }
    }
}
