package com.app.utils;

import java.util.HashMap;
import java.util.Map;

public class Errors {
	
	private final Map<String, String> _errors;
	
	public Errors(){
		_errors = new HashMap<>();
	}
	
	public void addError(String inputKey, String error){
		_errors.put(inputKey, error);
	}
	
	public String getError(String inputKey){
		return _errors.get(inputKey);
	}
	
	public int getSize(){
		return _errors.size();
	}

}
