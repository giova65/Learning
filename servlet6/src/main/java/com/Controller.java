package com;

public interface Controller {

	boolean handles(String url);
	void execute(Context context) throws Exception;
	
}
