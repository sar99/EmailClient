module emailClient {
	requires javafx.fxml;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.web;
	requires javafx.base;
	
	opens com.saniya;
	opens com.saniya.view;
	opens com.saniya.controller;
	//opens com.saniya.model;
}