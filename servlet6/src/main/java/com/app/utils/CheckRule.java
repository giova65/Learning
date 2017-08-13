package com.app.utils;

public interface CheckRule {

	public boolean check();
	
	public String getError();
	
	public String getField();
}
