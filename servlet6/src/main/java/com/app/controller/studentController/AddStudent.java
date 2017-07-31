package com.app.controller.studentController;

import com.Context;
import com.Controller;

public class AddStudent implements Controller {
	
	public static final String ROUTE = "/";

	@Override
	public boolean handles(String url) {
		return false;
	}

	@Override
	public void execute(Context context) throws Exception {
	}

}
