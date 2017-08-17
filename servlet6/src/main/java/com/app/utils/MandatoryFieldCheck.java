package com.app.utils;

public class MandatoryFieldCheck implements CheckRule{
	
	private final String _inputKey;
	private final String _inputValue;
	
	public MandatoryFieldCheck(String inputKey, String inputValue) {
		_inputKey = inputKey;
		_inputValue = inputValue;
	}

	@Override
	public boolean checkIsOk() {
		if(_inputValue.isEmpty()){
			return false;
		}else{
			return true;
		}
	}
	
	@Override
	public String getError(){
		return "Missing mandatory input: " + _inputKey;
	}

	@Override
	public String getInputKey() {
		return _inputKey;
	}
}
