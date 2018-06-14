<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
<%@include file ="/resources/css/index.css"%>
</style>
</head>
<body>
	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button class="navbar-toggle" type="button" data-toggle="collapse"
					data-target="#navbar-main">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Sitename</a>
			</div>
			<center>
				<div class="navbar-collapse collapse" id="navbar-main">
					<form class="navbar-form navbar-right" role="search"
						action="/NovcanikBankaREST/logout">
						<input type="submit" class="btn btn-default" value="Log out" />
					</form>
				</div>
			</center>
		</div>
	</div>
	<br/><br/><br/><br/><br/>
		<dir class="centarr">
		<div class="col-sm-4 col-md-4">
				<h1 class="title">15435.45 Din</h1>
				<a href="http://localhost:8080/NovcanikBankaREST/views/bank.jsp">
					<img
						src="resources/bank.jpg" height="380" width="395"
					class="img-responsive img-thumbnail">
					</a>
				</div>
		<div class="col-sm-4 col-md-4">
			<br/><br/><br/><br/><br/><br/>
			<form action="">
				<input type="text" name="prenos" align="top">
				<br/>
				<input type="submit" value="<<<" class="btn btn-primary btn-lg btn-block login-button">
			</form>
			<br/><br/><br/>
			<form action="">
				<br/>
				<input type="text" name="prenos">
				<input type="submit" value=">>>" class="btn btn-primary btn-lg btn-block login-button">
			</form>
		</div>
		<div class="col-sm-4 col-md-4">
				<h1 class="title">2345.34 Din</h1>
				
				<img
						src="resources/novcanik.jpg" height="340" width="340"
					class="img-responsive img-thumbnail">
				
		</div>
		</dir>
</body>
</html>