package com.project.helloworldjavafx.gui;

import com.project.helloworldjavafx.gui.util.Alerts;
import com.project.helloworldjavafx.gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    @FXML
    private TextField txtFirstNumber;
    @FXML
    private TextField txtSecondNumber;
    @FXML
    private Label lblResult;
    @FXML
    private Button btnSum;

    @FXML
    public void onBtnSumAction(){
        try {
            Locale.setDefault(Locale.US);
            double firstNumber = Double.parseDouble(txtFirstNumber.getText());
            double secondNumber = Double.parseDouble(txtSecondNumber.getText());
            double sum = firstNumber + secondNumber;
            lblResult.setText(String.format("%.2f", sum));
        } catch (NumberFormatException e){
            Alerts.showAlert("Error", "Parse error", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Constraints.setTextFieldDouble(txtFirstNumber);
        Constraints.setTextFieldDouble(txtSecondNumber);
        Constraints.setTextFieldMaxLength(txtFirstNumber, 10);
        Constraints.setTextFieldMaxLength(txtSecondNumber, 10);
    }
}
