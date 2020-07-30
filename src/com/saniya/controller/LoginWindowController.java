package com.saniya.controller;

import com.saniya.EmailManager;
import com.saniya.view.ViewFactory;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginWindowController extends BaseController{


	@FXML
    private TextField EmailAddressField;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private Label ErrorLabel;
    
    
    public LoginWindowController(EmailManager emailmanager, ViewFactory viewFactory, String fxmlName) {
		super(emailmanager, viewFactory, fxmlName);
		// TODO Auto-generated constructor stub
	}

    @FXML
    void LoginButtonAction(ActionEvent event) {
    	System.out.println("Hello there");
    	
    	viewFactory.showMainWindow();
    	
    	Stage stage = (Stage)ErrorLabel.getScene().getWindow();
    	viewFactory.closeStage(stage);
    	
    }

    
}
