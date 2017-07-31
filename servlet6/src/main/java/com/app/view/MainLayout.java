package com.app.view;

public class MainLayout{

		public String render(String content) {

			return "<!DOCTYPE html>"+
					"<html lang='en'>"+
						"<head>"+
							"<meta http-equiv='content-type' content='text/html; charset=UTF-8' />"+
							"<meta charset='utf-8' />"+
							"<title>Seminar</title>"+
							"<meta name='viewport' content='width=device-width, initial-scale=1' />"+
							"<meta http-equiv='X-UA-Compatible' content='IE=edge' />"+
							"<link rel='stylesheet' href='/css/bootstrap.min.css?v=1.0.0' media='screen' />"+
							"<link rel='stylesheet' href='/css/custom.css?v=1.0.0' />"+
							"<link rel='stylesheet' href='/css/app.css?v=1.0.0' />"+
							"<!--[if lt IE 9]>"+
								"<script src='https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js'></script>"+
								"<script src='https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js'></script>"+
							"<![endif]-->"+
						"</head>"+
						"<body>"+
							"<div class='navbar navbar-default navbar-fixed-top'>"+
								"<div class='container'>"+
									"<div class='navbar-header'>"+
										"<a href='/' class='navbar-brand'>Seminar</a>"+
										"<button class='navbar-toggle' type='button' data-toggle='collapse' data-target='#navbar-main'><span class='icon-bar'></span><span class='icon-bar'></span><span class='icon-bar'></span></button>"+
									"</div>"+
									"<div class='navbar-collapse collapse' id='navbar-main'>"+
										"<ul class='nav navbar-nav navbar-right'>"+
											"<li class='dropdown'><a class='dropdown-toggle' data-toggle='dropdown' href='#' id='download' aria-expanded='false'>Account <span class='caret'></span></a>"+
												"<ul class='dropdown-menu' aria-labelledby='download'>"+
													"<li><a href='/'>settings</a></li>"+
													"<li class='divider'></li>"+
													"<li><a href='/'>logout</a></li>"+
												"</ul>"+
											"</li>"+
										"</ul>"+
									"</div>"+
								"</div>"+
							"</div>"+
							"<div class='container'>"+
								"<div class='page-header' id='banner'>"+
									"<div class='row'>"+
										"<div class='col-lg-8 col-md-7 col-sm-6'>"+
											"<h1>Seminar</h1>"+
											"<p class='lead'>Manage your courses!</p>"+
										"</div>"+
									"</div>"+
									"<div class='row'>"+
										"<div class='col-lg-2 col-md-2 col-sm-3'>"+
											"<div class='list-group table-of-contents'>"+
												"<a class='list-group-item' href='/course/'>Course List</a>"+
												"<a class='list-group-item' href='/course/create'>Create Course</a>"+
											"</div>"+
										"</div>"+
										content+
									"</div>"+
								"</div>"+
								"<footer>"+
									"<div class='row'>"+
										"<div class='col-lg-12'>"+
											"<p><a href='http://bootswatch.com/cerulean' rel='nofollow'>Cerulean theme</a></p>"+
											"<p>Code released under the <a href='https://github.com/thomaspark/bootswatch/blob/gh-pages/LICENSE'>MIT License</a>.</p>"+
											"<p>GmTechnologies</p>"+
										"</div>"+
									"</div>"+
								"</footer>"+
							"</div>"+
							"<script src='/js/jquery.min.js?v=1.0.0'></script>"+
							"<script src='/js/bootstrap.min.js?v=1.0.0'></script>"+
							"<script src='/js/custom.js?v=1.0.0'></script>"+
						"</body>"+
					"</html>";
		}
}