package com.app.controller.courseController;


import static java.util.Arrays.*;

import java.util.List;

import com.Context;
import com.Controller;
import com.app.model.Course;
import com.app.view.MainLayout;


public class ListCourses implements Controller {
	
	private final List<Course> _courses;

	public static final List<String> ROUTE = asList("/course", "/course/", "/");

	public ListCourses(List<Course> courses) {
		_courses = courses;
	}
	
	@Override
	public boolean handles(String route) {
		return ROUTE.contains(route);
	}

	@Override
	public void execute(Context context) throws Exception {
		context.response().setContentType("text/html");
		context.response().setCharacterEncoding("UTF-8");
		context.response().getWriter().write(new MainLayout().render(courseTable()));
	}
	
	private String courseTable(){
		String courseTable = "<tr>";
		for (Course course : _courses) {
			courseTable += "<tr><td>" + course.id() + "</td>" +
					"<td>" + course.name() + "</td>" +
					"<td>" + course.location() + "</td>" +
					"<td>" + course.totalSeats() + "</td>" +
					"<td>" + course.startDate() + "</td></tr>";
		}

		return "<div class='col-lg-8 col-md-8 col-sm-9'>" +
				" <table class='table table-striped'>" +
				"  <thead>" +
				"   <tr>" +
				"    <th>" + Course.ID + "</th>" +
				"    <th>" + Course.NAME + "</th>" +
				"    <th>" + Course.LOCATION + "</th>" +
				"    <th>" + Course.TOTAL_SEATS + "</th>" +
				"    <th>" + Course.START_DATE + "</th>" +
				"   </tr>" +
				"  </thead>" +
				"  <tbody>" +
					courseTable +
				"  </tbody>" +
				" </table>" +
				"</div>";
	}

}