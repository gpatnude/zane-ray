package com.gregpatnude.zrtest.enums;

public enum PersonType {
	
	STUDENT(0, "Student"),
	INSTRUCTOR(1, "Instructor");
	
	private int key;
	private String label;
	
	private PersonType(int key, String label) {
		
		
	}

	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(int key) {
		this.key = key;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	

}
