<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="static/css/bootstrap.min.css"></script>
    <script src="static/js/bootstrap.min.js"></script>
<title>Welcome</title>
</head>
<body>
    <div class="container" id="homediv">
      <div class="jumbotron text-center">
        <H1>Complain form</H1>
        <H3>IT Department, Dharmsinh Desai University, Nadiad</H3>
      </div>
    </div>
  <div class="container-fluid bg" >
          <div class="row">
          <div class="col-md-3 col-sm-3 col-xs-12">
          </div>
          <div class="col-md-6 col-sm-6 col-xs-12">
          <form class="form-container" method="POST" action="/saveComplain" id="form1">
        <input type="hidden" name="complain_id" value="${complain.complain_id}"/>
                
                 <div class="form-group">
                  <label>Machine ID</label>
                  <input type="text" class="form-control" name="machineid" value="${complain.machineid}" id="machineid" placeholder="Machine ID">
                </div>
                 <div class="form-group">
                  <label>location</label>
                  <input type="text" class="form-control" name="location" value="${complain.location}" id="location" placeholder="location">
                </div>
                 <div class="form-group">
                  <label>Date</label>
                  <input type="text" class="form-control" name="date" value="${complain.date}" id="date" placeholder="Date">
                </div>
                <div class="form-group">
                  <label>Description</label><br/>
                  <input type="text" class="form-control" name="description" value="${complain.description}" id="description" placeholder="Description">
                </div>
               
                <button type="submit" class="btn btn-primary btn-block">Submit</button>
              </form>
          </div>
          <div class="col-md-3 col-sm-3 col-xs-12"></div>
          </div>
      </div>
</body>
</html>