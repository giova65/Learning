package com.app.controller.studentController;

import com.Context;
import com.Controller;

public class StudentController implements Controller {

	//questa classe dovra' gestire i vari controller per gestire gli studenti. Es.:
	//il controller che mostra gli studenti, per aggiungerne, per toglierne ecc...
	
	@Override
	public boolean handles(String route) {
		return false;
	}

	@Override
	public void execute(Context context) throws Exception {
	}

}
