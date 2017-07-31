package com.app.controller.courseController;

import static java.util.Arrays.*;

import java.util.List;

import com.Context;
import com.Controller;
import com.Servlet;
import com.app.model.Course;
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
			Servlet._courses.add(new Course(Servlet._courses.size()+1, context.by("name"), new Time("25.06.2019"), context.by("location"), Integer.valueOf(context.by("totalseats")), context.by("description")));
		}
	}
	
	
}