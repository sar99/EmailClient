package com.saniya.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginWindowController {

    @FXML
    private TextField EmailAddressField;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private Label ErrorLabel;

    @FXML
    void LoginButtonAction(ActionEvent event) {
    	System.out.println("Hello there");
    }

}
