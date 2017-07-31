package com;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.app.model.Course;
import com.app.model.Student;
import com.app.view.NotFound;

import utils.Time;

public class Servlet extends HttpServlet {

	
//	private SQLiteConnectionPoolDataSource _ds;
//	_ds = new SQLiteConnectionPoolDataSource();
//	_ds.setUrl("jdbc:sqlite:/path");
	
//	private HikariDataSource _ds;
//  _ds = new HikariDataSource();
//	_ds.setJdbcUrl("jdbc:sqlite:/path");
	
	private DataSource _ds;
	public static List<Course> _courses;
	
	@Override
	public void init() throws ServletException {
		try {
			_courses = new ArrayList();
			System.out.println(_courses.toString());
			
			_courses.add(new Course(1, "prova", new Time("22.11.1990"), "Mendrisio", 3, "description"));
			_courses.get(0).enroll(new Student("Giovanni", "Mele"));
			_courses.get(0).enroll(new Student("Enrico", "Mangano"));
			_courses.get(0).enroll(new Student("Manlio", "Modugno"));
			
			_courses.add(new Course(2, "prova2", new Time("13.04.2017"), "Mendrisio2", 3, "description2"));
			_courses.get(1).enroll(new Student("Giovanni2", "Mele2"));
			_courses.get(1).enroll(new Student("Enrico2", "Mangano2"));
			_courses.get(1).enroll(new Student("Manlio2", "Modugno2"));
			
			
			System.out.println(_courses.toString());
			_ds = (DataSource)new InitialContext().lookup("java:/comp/env/jdbc/ds");
		} catch (NamingException e) {
			throw new RuntimeException(e);
		}
	}
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		for(Controller c : new SeminarFactory().create()){
//			if(c.handles(req.getRequestURI())){
//				try {
//					
//					Connection connection = _ds.getConnection();
//					connection.setAutoCommit(false);
//					c.execute(new Context(req, resp, connection));
//					connection.commit();
//					connection.close();
//					return;
//				} catch (Exception e) {
//					resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
//					throw new RuntimeException(e);
//				}
//			}
//		}
//		resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
//		resp.getWriter().write("<h2>404</h2><p>Not found</p>");
//	}
//	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		for(Controller c : new SeminarFactory().create()){
//			if(c.handles(req.getRequestURI())){
//				try {
//					
//					Connection connection = _ds.getConnection();
//					connection.setAutoCommit(false);
//					c.execute(new Context(req, resp, connection));
//					connection.commit();
//					connection.close();
//					return;
//				} catch (Exception e) {
//					resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
//					throw new RuntimeException(e);
//				}
//			}
//		}
//		resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
//		resp.getWriter().write("<h2>404</h2><p>Not found</p>");	
//	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		for(Controller c : new SeminarFactory().create()){
			if(c.handles(req.getRequestURI())){
				try {
					
					Connection connection = _ds.getConnection();
					connection.setAutoCommit(false);
					c.execute(new Context(req, resp, connection));
					connection.commit();
					connection.close();
					return;
				} catch (Exception e) {
					resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
					throw new RuntimeException(e);
				}
			}
		}
		resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
		resp.getWriter().write(new NotFound().render());
	}
}
