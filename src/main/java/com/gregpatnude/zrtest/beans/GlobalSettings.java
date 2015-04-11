package com.gregpatnude.zrtest.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class GlobalSettings {

	private static final String applicationTitle = "Zane-Ray's Java Coding Test [Greg Patnude]";

	public String getApplicationTitle() {

		return applicationTitle;
	
	}
		
}