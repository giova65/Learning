package com.app.utils;

public interface CheckRule {

	public boolean checkIsOk();
	
	public String getError();
	
	public String getInputKey();
}
