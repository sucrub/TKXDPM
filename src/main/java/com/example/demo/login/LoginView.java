package com.example.demo.login;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginView {

    @FXML
    private Label titleLabel;

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    protected void onLoginButtonClick() {
        // Add your login logic here
        System.out.println("Username: " + usernameField.getText());
        System.out.println("Password: " + passwordField.getText());
    }
}
