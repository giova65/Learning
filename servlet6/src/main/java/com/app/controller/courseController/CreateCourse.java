package com.app.controller.courseController;

import static java.util.Arrays.*;

import java.util.List;

import com.Context;
import com.Controller;
import com.Servlet;
import com.app.model.Course;
import com.app.utils.DateFormatCheck;
import com.app.utils.InputCheck;
import com.app.utils.MandatoryField;
import com.app.utils.MandatoryFieldCheck;
import com.app.utils.NumberCheck;
import com.app.view.Form;
import com.app.view.MainLayout;

import utils.Time;
public class CreateCourse implements Controller {

	public static final List<String> ROUTE = asList("/course/create/", "/course/create");
	private InputCheck _input;
	
	public CreateCourse(){
		_input = new InputCheck().setCheck(Course.NAME, new MandatoryFieldCheck())
								.setCheck(Course.START_DATE, new MandatoryFieldCheck(), new DateFormatCheck())
								.setCheck(Course.LOCATION, new MandatoryFieldCheck())
								.setCheck(Course.TOTAL_SEATS, new MandatoryFieldCheck(), new NumberCheck());
								
	}
	
	@Override
	public boolean handles(String route) {
		return ROUTE.contains(route);
	}

	@Override
	public void execute(Context context) throws Exception {
		
		if(!context.isPost()){
			context.response().getWriter().write(new MainLayout().render(new Form().render()));
		}
		if(context.isPost()){
			if(_input.isCorrect()){
				Servlet._courses.add(new Course(Servlet._courses.size()+1, context.by(Course.NAME), new Time(context.by(Course.START_DATE)), context.by(Course.LOCATION), Integer.valueOf(context.by(Course.TOTAL_SEATS)), context.by(Course.DESCRIPTION)));
				context.response().sendRedirect("/course/");
			}else{
				//riproporre con rosso e verde ecc
			}
		}
	}
	
	
}