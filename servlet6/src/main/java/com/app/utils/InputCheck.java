package com.app.utils;

import static java.util.Arrays.*;

import java.util.List;
import java.util.Map;

public class InputCheck {
	
	private List<CheckRule> _checkRuleList;
	private Errors _errors;
	private Map<String, CheckRule> _ruleSet;
	
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
		return _errors.getSize() > 0;
	}

}
