package com;

import static java.util.Arrays.*;

import java.util.List;

import com.app.controller.courseController.CourseController;
import com.app.controller.studentController.StudentController;


public class SeminarFactory {
	
	public List<Controller> create(){
		return asList(new CourseController(), new StudentController());
	}

}
