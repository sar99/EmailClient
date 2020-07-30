package com.saniya.controller;

import com.saniya.EmailManager;
import com.saniya.view.ViewFactory;

public abstract class BaseController {
		
		protected EmailManager emailmanager;
		protected ViewFactory viewFactory;
		private String fxmlName;
		
		public BaseController(EmailManager emailmanager, ViewFactory viewFactory, String fxmlName) {
			super();
			this.emailmanager = emailmanager;
			this.viewFactory = viewFactory;
			this.fxmlName = fxmlName;
		}
		
	    public String getFXMLName() {
	    	return fxmlName;
	    }

}
