package com.saniya.controller;

import com.saniya.EmailManager;
import com.saniya.view.ViewFactory;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.web.WebView;

public class MainWindowController extends BaseController {

	@FXML
    private TreeView<?> emailTreeView;

    @FXML
    private TableView<?> emailTableView;

    @FXML
    private WebView emailWebView;
    
    
    public MainWindowController(EmailManager emailmanager, ViewFactory viewFactory, String fxmlName) {
		super(emailmanager, viewFactory, fxmlName);
		// TODO Auto-generated constructor stub
	}

    
    @FXML
    void AddAcountAction(ActionEvent event) {
    	
    	viewFactory.showLoginWindow();
    } 
    
    @FXML
    void optionsAction(ActionEvent event) {
    	viewFactory.showOptionsWindow();
    }

}
