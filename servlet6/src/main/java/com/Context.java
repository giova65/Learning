package com;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Context {

	private final HttpServletRequest _request;
	private final HttpServletResponse _response;
	private final Connection _connection;

	public Context(HttpServletRequest request, HttpServletResponse response, Connection connection) {
		_request = request;
		_response = response;
		_connection = connection;
	}

	public HttpServletRequest request() {
		return _request;
	}
	
	public String getRequestURI(){
		return this.request().getRequestURI();
	}

	public HttpServletResponse response() {
		return _response;
	}

	public Connection connection() {
		return _connection;
	}
	
	public boolean isPost() {
		return _request.getMethod().equals("POST");
	}
	
	public String by(String name){
		return _request.getParameter(name.toLowerCase());
	}
}
