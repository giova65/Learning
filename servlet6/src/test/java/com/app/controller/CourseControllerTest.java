package com.app.controller;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.app.controller.courseController.CourseController;

public class CourseControllerTest {
	
	private CourseController _courseController;
	
	@Before
	public void init(){
		_courseController = new CourseController();
	}
	
	@Test
	public void handleRoutes() throws Exception {
		assertThat(_courseController.handles("/"), is(true));
		assertThat(_courseController.handles("/course/"), is(true));
		assertThat(_courseController.handles("/course/create"), is(true));
		assertThat(_courseController.handles("/course/create/"), is(true));
	}

}
