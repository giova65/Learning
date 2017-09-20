package com.app.utils;

import static java.util.Arrays.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputCheck {
	
	private List<CheckRule> _checkRuleList;
	private final Errors _errors;
	private final Map<String, CheckRule> _ruleSet;
	
	public InputCheck(){
		_checkRuleList = new ArrayList<>();
		_ruleSet = new HashMap<>();
		_errors = new Errors();
	}
	
	public InputCheck setCheck(CheckRule ... rule) {
		_checkRuleList = asList(rule);
		for(CheckRule checkRule : _checkRuleList){
			_ruleSet.put(checkRule.getInputKey(), checkRule);
		}
		return this;
	}

	public boolean isCorrect(){
		for (CheckRule checkRule : _checkRuleList){
			if(!checkRule.checkIsOk()){
				_errors.addError(checkRule.getInputKey(), checkRule.getError());
			}
		}
		return _errors.getSize() < 1;
	}
	
	public Errors getErrors(){
		return _errors;
	}

}
