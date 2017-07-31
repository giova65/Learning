package com.app.controller.courseController;

import static java.util.Arrays.*;

import java.util.List;

import com.Context;
import com.Controller;
import com.Servlet;

public class CourseController implements Controller{

	private final List<List<String>> _routes = asList(ListCourses.ROUTE,CreateCourse.ROUTE);
	
	@Override
	public boolean handles(String url) {
		for(List<String> route : _routes){
			if(route.contains(url)){
				return true;
			}
		}
		return false;
	}

	@Override
	public void execute(Context context) throws Exception {
		List<Controller> actions = asList(new ListCourses(Servlet._courses), new CreateCourse());
		for(Controller action : actions){
			if(action.handles(context.getRequestURI())){
				action.execute(context);
			}
		}
	}

}
