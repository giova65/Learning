package com.app.controller.courseController;

import static java.util.Arrays.*;

import java.util.List;

import com.Context;
import com.Controller;
import com.Servlet;
import com.app.model.Course;
import com.app.utils.DateFormatCheck;
import com.app.utils.InputCheck;
import com.app.utils.MandatoryFieldCheck;
import com.app.utils.NumberCheck;
import com.app.view.Form;
import com.app.view.MainLayout;

import utils.Time;
public class CreateCourse implements Controller {

	public static final List<String> ROUTE = asList("/course/create/", "/course/create");	
	
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
			InputCheck _input = new InputCheck()
					.setCheck(new MandatoryFieldCheck(Course.NAME, context.by(Course.NAME)))
					.setCheck(new MandatoryFieldCheck(Course.START_DATE, context.by(Course.START_DATE)), new DateFormatCheck())
					.setCheck(new MandatoryFieldCheck(Course.LOCATION, context.by(Course.LOCATION)))
					.setCheck(new MandatoryFieldCheck(Course.TOTAL_SEATS, context.by(Course.TOTAL_SEATS)), new NumberCheck());
			
			if(_input.isCorrect()){
				Servlet._courses.add(new Course(Servlet._courses.size()+1, context.by(Course.NAME), new Time(context.by(Course.START_DATE)), context.by(Course.LOCATION), Integer.valueOf(context.by(Course.TOTAL_SEATS)), context.by(Course.DESCRIPTION)));
				context.response().sendRedirect("/course/");
			}else{
				//riproporre con rosso e verde ecc
			}
		}
	}
	
	
}