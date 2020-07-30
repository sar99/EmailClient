package com.saniya.view;

import java.io.IOException;

import com.saniya.EmailManager;
import com.saniya.controller.BaseController;
import com.saniya.controller.LoginWindowController;
import com.saniya.controller.MainWindowController;
import com.saniya.controller.OptionsWindowController;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewFactory {
	private EmailManager emailManager;

	public ViewFactory(EmailManager emailManager) {
		super();
		this.emailManager = emailManager;
	}
	
	
	//View options handling 
	private ColorTheme colorTheme = ColorTheme.DEFAULT;
	private FontSize fontSize = FontSize.MEDIUM;
	
	
	public void setColorTheme(ColorTheme colorTheme)
	{
		this.colorTheme = colorTheme;
	}
	
	public ColorTheme getColorTheme()
	{
		return this.colorTheme;
	}
	
	public void setFontSize(FontSize fontSize)
	{
		this.fontSize = fontSize;
	}
	
	public FontSize getFontSize()
	{
		return this.fontSize;
	}
	
	
	
	
	
	private void initializer(BaseController controller)
	{
		FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource(controller.getFXMLName()));
		fxmlloader.setController(controller);
		
		Parent parent;
		
		try {
			parent = fxmlloader.load();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return;
		}
		
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		
		stage.setScene(scene);
		stage.show();
	}
	
	
	
	public void closeStage(Stage stageToClose)
	{
		stageToClose.close();
	}
	
	
	
	public void showLoginWindow() {
		System.out.println("hi");
		
		BaseController controller = new LoginWindowController(emailManager, this, "LoginWindow.fxml");
		initializer(controller);
		
	}
	
	
	public void showMainWindow() {
		System.out.println("hiMain");
		
		BaseController controller = new MainWindowController(emailManager, this, "MainWindow.fxml");
		initializer(controller);
		
	}
	
	
	
	public void showOptionsWindow() {
		BaseController controller = new OptionsWindowController(emailManager, this, "OptionsWindow.fxml");
		initializer(controller);
	}
	

}
