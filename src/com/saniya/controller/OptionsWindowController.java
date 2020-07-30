package com.saniya.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.saniya.EmailManager;
import com.saniya.view.ColorTheme;
import com.saniya.view.FontSize;
import com.saniya.view.ViewFactory;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class OptionsWindowController extends BaseController implements Initializable{

	@FXML
    private Slider fontSizePicker;

    @FXML
    private ChoiceBox<ColorTheme> themePicker;
    
    
    public OptionsWindowController(EmailManager emailmanager, ViewFactory viewFactory, String fxmlName) {
		super(emailmanager, viewFactory, fxmlName);
		// TODO Auto-generated constructor stub
	}
    

    @FXML
    void ApplyButtonAction() {
    	viewFactory.setColorTheme(themePicker.getValue());
    	viewFactory.setFontSize((FontSize.values()[(int)(fontSizePicker.getValue())]));
    	viewFactory.updateStyles();
    }

    @FXML
    void CancelButtonAction() {
    	Stage stage = (Stage)fontSizePicker.getScene().getWindow();
    	viewFactory.closeStage(stage);
    }


	@Override
	public void initialize(URL loacation, ResourceBundle resources) {
		
		setUpThemePicker();
		setUpSizePicker();
		
	}
	
	private void setUpThemePicker() {
		themePicker.setItems(FXCollections.observableArrayList(ColorTheme.values()));
		themePicker.setValue(viewFactory.getColorTheme());
	}
	
	private void setUpSizePicker()
	{
		fontSizePicker.setMin(0);
		fontSizePicker.setMax(FontSize.values().length-1);
		fontSizePicker.setValue(viewFactory.getFontSize().ordinal());
		fontSizePicker.setMajorTickUnit(1);
		fontSizePicker.setMinorTickCount(0);
		fontSizePicker.setBlockIncrement(1);
		fontSizePicker.setSnapToTicks(true);
		fontSizePicker.setShowTickLabels(true);
		fontSizePicker.setShowTickMarks(true);
		fontSizePicker.setLabelFormatter(new StringConverter<Double>() {
			@Override
			public String toString(Double object) {
				int i = object.intValue();
				return FontSize.values()[i].toString();
			}
			
			@Override
			public Double fromString(String sting) {
			return null;
			}
		});
		
		fontSizePicker.valueProperty().addListener((obs, oldVal, newVal) ->
		{
			fontSizePicker.setValue(newVal.intValue());
		});
	}
    
    
    
}


