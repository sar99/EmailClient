package com.saniya.controller;

import com.saniya.EmailManager;
import com.saniya.view.ViewFactory;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;

public class OptionsWindowController extends BaseController{

	@FXML
    private AnchorPane fontSizePicker;

    @FXML
    private ChoiceBox<?> themePicker;
    
    
    public OptionsWindowController(EmailManager emailmanager, ViewFactory viewFactory, String fxmlName) {
		super(emailmanager, viewFactory, fxmlName);
		// TODO Auto-generated constructor stub
	}
    

    @FXML
    void ApplyButtonAction() {

    }

    @FXML
    void CancelButtonAction() {

    }
    
    
    
}


