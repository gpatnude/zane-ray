package com.gregpatnude.zrtest.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/** 
 * This utility class is used to add error messages into the JSF Context.
 * @author Greg Patnude
 *
 */
public class FacesUtil {

	public static void addError(String message) {
		
		addError(message, null);
		
	}

	public static void addError(String message, String compId) {
		
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, message, message);
		FacesContext.getCurrentInstance().addMessage(compId, msg);
		
	}
}
