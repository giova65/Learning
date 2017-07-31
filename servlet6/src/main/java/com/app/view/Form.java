package com.app.view;

public class Form {
	
	public String render() {

		return   "<div class='col-lg-8 col-md-8 col-sm-9'>" +
				            "<form class='form-horizontal' role='form' method='post' action='/course/create'>" +
				                
				            	"<div class='form-group'>" +
				                    "<label for='name' class='col-sm-2 control-label'>Name</label>" +
				                    "<div class='col-sm-10'>" +
				                        "<input type='text' class='form-control' id='name' name='name'>" +
				                    "</div>" +
				                "</div>" +
				                    
				               input("Start") + 
				               input("Location") + 
				               input("TotalSeats") + 
				               input("Description") + 
				               
				                "<div class='form-group'>" +
				                    "<div class='col-sm-10 col-sm-offset-2'>" +
				                        "<input id='submit' name='submit' type='submit' value='Send' class='btn btn-primary'>" +
				                    "</div>" +
				                "</div>" +
				            "</form>" +
				        "</div>" +
				    "</div>" +
				"<script src='/js/jquery.min.js'></script>" +
				"<script src='/js/bootstrap.min.js'></script>" +
				"</body>";
	}
	
	private String input(String field){
		return "<div class='form-group'>" +
             		"<label for="+field.toLowerCase()+" class='col-sm-2 control-label'>"+field+"</label>" +
             		"<div class='col-sm-10'>" +
             			"<input type='text' class='form-control' id='"+field.toLowerCase()+"' name='"+field.toLowerCase()+"'>" +
             		"</div>" +
             		"<span></span>" +
             	"</div>";
	}
	
}
