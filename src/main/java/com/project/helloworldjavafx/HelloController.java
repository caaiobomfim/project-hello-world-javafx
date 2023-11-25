package com.project.helloworldjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private Button btnTest;

    @FXML
    public void onBtnTestAction() {
        System.out.println("CLICK");
    }
}