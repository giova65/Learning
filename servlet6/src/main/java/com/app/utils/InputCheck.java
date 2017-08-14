package com.app.utils;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.*;

public class InputCheck {
	
	private List<CheckRule> _checkRules;
	private List<Errors> _errors;
	private Map<String, CheckRule> _ruleSet;
	
	public InputCheck setCheck(CheckRule ... rule) {
		_checkRules = asList(rule);
		for(CheckRule rule : _checkRules){
			_ruleSet.put(rule.getInputKey(), rule);
		}
		return this;
	}

	public boolean isCorrect(){
		
		for (CheckRule check : _checkRules){
			if(!check.check(_inputKey)){
				_errors.add(new Error(check.getField(), check.getError());
			}
		}
	}

}
