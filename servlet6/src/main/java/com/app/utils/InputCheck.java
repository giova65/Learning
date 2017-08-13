package com.app.utils;

import java.util.List;
import static java.util.Arrays.*;

public class InputCheck {
	
	private List<CheckRule> _checkRules;
	private List<Errors> _errors;
	
	public InputCheck setCheck(String input, CheckRule ... rule) {
		_checkRules = asList(rule);
		return this;
	}

	public boolean isCorrect(){
		
		for (CheckRule check : _checkRules){
			if(!check.check()){
				_errors.add(new Error(check., check.getError());
			}
		}
	}
}
