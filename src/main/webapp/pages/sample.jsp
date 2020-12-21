<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div class="container-fluid bg" >
            <div class="row">
            <div class="col-md-3 col-sm-3 col-xs-12">
            </div>
            <div class="col-md-6 col-sm-6 col-xs-12">
            <form class="form-container" method="POST" action="/saveMachine">
                <input type="hidden" name="comid" value="${computer.comid}"/>        
                  <div class="form-group">
                    <label>Machine ID</label>
                 	<input type="text" class="form-control" name="machineid" value="${computer.machineid}" id="machineid" placeholder="Machine id">
				</div>
                  <div class="form-group">
                    <label>Location</label>
                    <input type="text" class="form-control" name="location" value="${computer.location}" id="location" placeholder="Location">
                 </div>
                  <div class="form-group">
                    <label>Quantity</label>
                    <input type="text" class="form-control" name="quantity" id="quantity" placeholder="Quantity">
                 </div>
                 <button type="submit" name="submit" value="submit" class="btn btn-primary btn-block">Submit</button>
                </form>
            </div>
            <div class="col-md-3 col-sm-3 col-xs-12"></div>
            </div>
        </div>
</body>
</html>