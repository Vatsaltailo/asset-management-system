<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="/pages/static/index.css">
    <script src="static/css/bootstrap.min.css"></script>
    <script src="static/js/bootstrap.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

.navbar {
  overflow: hidden;
  background-color: #333;
}

.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}
</style>
<title>Welcome</title>
</head>
<body>
<div class="navbar">
	<a href="/welcome">Welcome</a>
	<a href="/signin">Faculty SignIn</a>
	<a href="/adminsignin">Admin SignIn</a>
	<!-- <div class="dropdown">
	    <button class="dropbtn">Sign In
	      <i class="fa fa-caret-down"></i>
	    </button>
    	<div class="dropdown-content">
      		<a href="/signin">Link 1</a>
      		<a href="/signin">Link 2</a>
    	</div>
  	</div>
  	<div class="dropdown">
	    <button class="dropbtn">Sign Up
	      <i class="fa fa-caret-down"></i>
	    </button>
	    <div class="dropdown-content">
	      <a href="/signup">Link 1</a>
	      <a href="/signup">Link 2</a>
	    </div>
  	</div> -->
</div>
	<c:choose>
		<c:when test="${mode=='welcome'}">
		<div class="container" id="homediv">
			<div class="jumbotron text-center">
				<H1>Welcome to IT Forum</H1>
				<H3>IT Department, Dharmsinh Desai University, Nadiad</H3>
			</div>
		</div>
		</c:when>
		
		<c:when test="${mode=='signin'}">
    	<div class="container-fluid bg" >
	        <div class="row">
	        <div class="col-md-3 col-sm-3 col-xs-12">
	        </div>
	        <div class="col-md-6 col-sm-6 col-xs-12">
	        <form class="form-container" method="POST" action="welcomeuser">
				<input type="hidden" name="id" value="${student.id}"/>        
	              <div class="form-group">
	                <label>Faculty ID</label>
	                <input type="text" class="form-control" name="sid" value="${student.sid}" id="sid" placeholder="Faculty id">
	              </div>
	               <div class="form-group">
	                <label>Password</label>
	                <input type="password" class="form-control" name="password" value="${student.password}" id="Password" placeholder="Password">
	              </div> 
	              <button type="submit" class="btn btn-primary btn-block">Submit</button>
	            </form>
	        </div>
	        <div class="col-md-3 col-sm-3 col-xs-12"></div>
	        </div>
	    </div>
	    </c:when>
	    <c:when test="${mode=='adminsignup'}">
	    <div class="container-fluid bg" >
	        <div class="row">
	        <div class="col-md-3 col-sm-3 col-xs-12">
	        </div>
	        <div class="col-md-6 col-sm-6 col-xs-12">
	        <form class="form-container" method="POST" action="saveadmin">
				<input type="hidden" name="id" value="${admin.id}"/>        
	              <div class="form-group">
	                <label>Admin ID</label>
	                <input type="text" class="form-control" name="aid" value="${admin.aid}" id="aid" placeholder="Admin ID">
	              </div>
	              <div class="form-group">
	                <label>Admin Name</label>
	                <input type="text" class="form-control" name="a_name" value="${admin.a_name}" id="a_name" placeholder="Admin Name">
	              </div>
	              <div class="form-group">
	                <label>Password</label>
	                <input type="password" class="form-control" name="password" value="${admin.password}" id="Password" placeholder="Password">
	              </div>
	              <button type="submit" class="btn btn-primary btn-block">Submit</button>
	            </form>
	        </div>
	        <div class="col-md-3 col-sm-3 col-xs-12"></div>
	        </div>
	    </div>
	    </c:when>
	    <c:when test="${mode=='adminsignin'}">
    	<div class="container-fluid bg" >
	        <div class="row">
	        <div class="col-md-3 col-sm-3 col-xs-12">
	        </div>
	        <div class="col-md-6 col-sm-6 col-xs-12">
	        <form class="form-container" method="POST" action="welcomeadmin">
				<input type="hidden" name="id" value="${admin.id}"/>        
	              <div class="form-group">
	                <label>Admin ID</label>
	                <input type="text" class="form-control" name="aid" value="${admin.aid}" id="aid" placeholder="Admin id">
	              </div>
	               <div class="form-group">
	                <label>Password</label>
	                <input type="password" class="form-control" name="password" value="${admin.password}" id="Password" placeholder="Password">
	              </div> 
	              <button type="submit" class="btn btn-primary btn-block">Submit</button>
	            </form>
	        </div>
	        <div class="col-md-3 col-sm-3 col-xs-12"></div>
	        </div>
	    </div>
	    </c:when>
	    
	</c:choose>
    <script src="static/jquery-3.4.1.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>