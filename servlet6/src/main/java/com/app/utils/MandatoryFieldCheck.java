package com.app.utils;

public class MandatoryFieldCheck implements CheckRule{
	
	private String _error;
	
	public MandatoryFieldCheck(String _error) {
		this._error = "Missing mandatory input: " + _error;
	}

	@Override
	public boolean check() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String getError(){
		return _error;
	}
}
