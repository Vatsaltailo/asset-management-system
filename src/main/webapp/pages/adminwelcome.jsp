<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
 <script type="text/javascript">
                    function myfun()
                    {
                    var search=document.getElementById("item").value;
                    console.log(search);
                    
                    var type=document.getElementById("type");
                    if(search=="location")
                    {
                    	console.log(search);
                    	$("#type").hide();
                    	$("#l2").hide();
                    	$("#location").show();
                		$("#l1").show();
                    	
                    	}
                    else
                    	{
		                    $("#type").show();
		                    $("#l2").show();
                    		$("#location").hide();
                    		$("#l1").hide();
                    	}
                    	}
</script>
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
<title>Admin Welcome</title>
</head>
<body>
    <div class="navbar">
        <a href="/fixedasset">Fixed Assets</a>
        <a href="/recurring">Recurring</a>
        <a href="/search">Search</a>
        <a href="/allocate">Allocate Equipment</a>
        <a href="/showcomplain">Complains</a>
        <a href="/signup">Faculty SignUp</a>
    	 <a href="/adminsignup">Admin SignUp</a>
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
        <c:when test="${mode=='welcome1'}">
            <div class="container" id="homediv">
                <div class="jumbotron text-center">
                    <H1>Welcome to IT Forum</H1>
                    <H3>IT Department, Dharmsinh Desai University, Nadiad</H3>
                </div>
            </div>
        </c:when>
        
        <c:when test="${mode=='signup'}">
    	<div class="container-fluid bg" >
	        <div class="row">
	        <div class="col-md-3 col-sm-3 col-xs-12">
	        </div>
	        <div class="col-md-6 col-sm-6 col-xs-12">
	        <form class="form-container" method="POST" action="saveuser">
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
        
        <c:when test="${mode=='fixedasset'}">
            <div class="container-fluid bg" >
            <div class="row">
            <div class="col-md-3 col-sm-3 col-xs-12">
            </div>
            <div class="col-md-6 col-sm-6 col-xs-12">
            <form class="form-container" method="POST" action="/savefixedasset">
                <input type="hidden" name="billid" value="${fixedasset.billid}"/>        
                 
                 
                 <div class="form-group">
                    <label>Bill NO</label>
                    <input type="text" class="form-control" name="billno" value="${fixedasset.billno}" id="billno" placeholder="Bill No">
                  </div>
                  <div class="form-group">
                    <label>Bill Issuer</label>
                    <input type="text" class="form-control" name="billissuer" value="${fixedasset.billissuer}" id="billissuer" placeholder="Bill Issuer">
                  </div>
                    <div class="form-group">
                    <label>Equipment Type</label>
                   <select name=type id=type>
                   <option value="Computer">Computer</option>
                   <option value="printer">printer</option>
                   <option value="AC">AC</option>
                   <option value="Switch">Switch</option>
                   <option value="Router">Router</option>
                   <option value="projector">projector</option>
                   
                   </select>
                  </div>
                   <div class="form-group">
                    <label>Location</label>
                    <input type="text" class="form-control" name="location"  id="location" placeholder="Location">
                 </div>	
                 
                  <div class="form-group">
                    <label>Quantity</label>
                    <input type="number" class="form-control" name="quantity" value="${fixedasset.quantity}" id="quantity" placeholder="quantity">
                  </div>
                  
                  <div class="form-group">
                    <label>Description</label>
                     <input type="text" class="form-control" name="description" value="${fixedasset.description}" id="description" placeholder="Description"> 
                  </div>
                  <div class="form-group">
                    <label>Date</label>
                     <input type="text" class="form-control" name="Date" value="${fixedasset.date}" id="Date" placeholder="Date"> 
                  </div>
                  <div class="form-group">
                    <label>Unit Price</label>
                     <input type="text" class="form-control" name="unitprice" value="${fixedasset.unitprice}" id="unitprice" placeholder="unitprice"> 
                  </div>
                 
                   	<div class="col-md-6 col-sm-6 col-xs-12">
                  <button type="submit" name="save" value="save" class="btn btn-primary btn-block">Save</button>
                	</div>
                
                  	<div class="col-md-6 col-sm-6 col-xs-12">
                <a href="<c:url value='/showassets'  />"
					class="btn btn-primary btn-block"><i class="fas fa-file-excel"></i>
					Show All Fixed Assets</a>
					</div>
            	</form>
            </div>
            <div class="col-md-3 col-sm-3 col-xs-12"></div>
            </div>
        </div>
        </c:when>
        
        
        
        
        
        <c:when test="${mode=='recurring'}">
           <div class="container-fluid bg" >
            <div class="row">
            <div class="col-md-3 col-sm-3 col-xs-12">
            </div>
            <div class="col-md-6 col-sm-6 col-xs-12">
            <form class="form-container" method="POST" action="/saverecurring">
                <input type="hidden" name="billid" value="${recurring.billid}"/>        
                 
                 
                 <div class="form-group">
                    <label>Bill NO</label>
                    <input type="text" class="form-control" name="billno" value="${recurring.billno}" id="billno" placeholder="Bill No">
                  </div>
                  <div class="form-group">
                    <label>Bill Issuer</label>
                    <input type="text" class="form-control" name="billissuer" value="${recurring.billissuer}" id="billissuer" placeholder="Bill Issuer">
                  </div>
                    <div class="form-group">
                    <label>Equipment Type</label>
                   <select name=type id=type>
                   <option value="Computer">Computer</option>
                   <option value="mouse">Mouse</option>
                   <option value="keybord">KeyBord</option>
                   <option value="cpu">CPU</option>
                   <option value="monitor">Monitor</option>
                   <option value="printer">printer</option>
                   <option value="ram">RAM</option>
                   <option value="motherboard">MotherBord</option>
                   <option value="printer">Printer</option>
                   <option value="AC">AC</option>
                   <option value="Switch">Switch</option>
                   <option value="Router">Router</option>
                   <option value="projector">projector</option>
                   
                   
                   </select>
                  </div>
                  
                 
                  <div class="form-group">
                    <label>Total Quantity</label>
                    <input type="number" class="form-control" name="total" value="${recurring.total}" id="total" placeholder="totalQuantity">
                  </div>
                  
                  <div class="form-group">
                    <label>Description</label>
                     <input type="text" class="form-control" name="description" value="${recurring.description}" id="description" placeholder="Description"> 
                  </div>
                  <div class="form-group">
                    <label>Date</label>
                     <input type="text" class="form-control" name="Date" value="${recurring.date}" id="Date" placeholder="Date"> 
                  </div>
                  <div class="form-group">
                    <label>Unit Price</label>
                     <input type="text" class="form-control" name="unitprice" value="${recurring.unitprice}" id="unitprice" placeholder="unitprice"> 
                  </div>
                 
                 	<div class="col-md-6 col-sm-6 col-xs-12">
                  <button type="submit" name="save" value="save" class="btn btn-primary btn-block">Save</button>
                	</div>
                	<div class="col-md-6 col-sm-6 col-xs-12">
                
                 <a href="<c:url value='/showrecurring'  />"
					class="btn btn-primary btn-block"><i class="fas fa-file-excel"></i>
					Show All Recurring</a>
					</div>
            	</form>
            </div>
            <div class="col-md-3 col-sm-3 col-xs-12"></div>
            </div>
        </div>
        </c:when>
        
        
        <c:when test="${mode=='search'}">
             <div class="container-fluid bg" >
           	 <div class="row">
             <div class="col-md-3 col-sm-3 col-xs-12">
           	 </div>
             <div class="col-md-6 col-sm-6 col-xs-12">
             <form class="form-container" method="POST" action="/searchby"><!-- -->
        
             <div class="form-group">
                    <label>Search BY</label>
                    <select name="search" id="item" onchange="myfun()">
                       <option value="location">Location</option>
                       <option value="itemtype">Item Type</option>
                    </select>
                 
                 <div class="form-group">
                    <label id="l1"  >Location </label>
                   <select name="location" id="location" ">
                   <option value="SW1">SW1</option>
                   <option value="SW2">SW2</option>
                   <option value="SW3">SW3</option>
                   <option value="SW4">SW4</option>
                   <option value="SW5">SW5</option>
                   
                    </select>
                  </div>
               
            
                 <div class="form-group">
                    <label id="l2" style="display:none;">Equipment Type</label>
                   <select name="type" id="type" style="display:none;">
                   <option value="Computer">Computer</option>
                   <option value="mouse">Mouse</option>
                   <option value="keybord">KeyBord</option>
                   <option value="cpu">CPU</option>
                   <option value="monitor">Monitor</option>
                   <option value="printer">printer</option>
                   <option value="ram">RAM</option>
                   <option value="motherboard">MotherBord</option>
                   <option value="printer">Printer</option>
                   <option value="AC">AC</option>
                   <option value="Switch">Switch</option>
                   <option value="Router">Router</option>
                   <option value="projector">projector</option>
                    </select>
                  </div>
             </div>
             <button type="submit" name="search" value="search" class="btn btn-primary btn-block">Search</button>
        	 </form>
        	 </div>
        	 </div>
             </div>
        </c:when> 
        
        
        <c:when test="${mode=='showsearch1'}">
            <div class="container" id="homediv">
                <div class="jumbotron text-center">
                    <H3>Search BY Location</H3>
                    <table border="1" style="width:100%"   cellpadding="10">
                	<thead>
                	
                		<tr>
                			<th >Type</th>
                			<th >Description</th>       			
                			
                		</tr>
                	</thead>
                <tbody>
               
				<c:set var="i" value="1" />
				<c:forEach items="${OE}" var="u">
				<tr>
			
			<td>${u.type}</td>
			<td>${u.description}</td>
				</tr>
			<c:set var="i" value="${i+1}" />
				</c:forEach>
				<c:set var="i" value="1" />
				<c:forEach items="${computer}" var="u">
				<tr>
			
			<td>${u.machineid}</td>
			<td>${u.description}</td>
				</tr>
			<c:set var="i" value="${i+1}" />
				</c:forEach>
                </tbody>
                </table> 
                 
                </div>
                    
                </div>

        </c:when>
        <c:when test="${mode=='showsearch2'}">
            <div class="container" id="homediv">
                <div class="jumbotron text-center">
                    <H3>Search BY Item Type</H3>
                    
                    
                <table border="1" style="width:100%"   cellpadding="10">
                	<thead>
                	
                		<tr>
                			<th >Logical ID</th>
                			<th >location</th>
                			<th >Description</th>       			
                			
                		</tr>
                	</thead>
                <tbody>
               
				<c:set var="i" value="1" />
				<c:forEach items="${OE}" var="u">
				<tr>
			<td>${u.logicalid}</td>
			<td>${u.location}</td>
			<td>${u.description}</td>
			
				</tr>
			<c:set var="i" value="${i+1}" />
				</c:forEach>
				<c:set var="i" value="1" />
				<c:forEach items="${computer}" var="u">
				<tr>
			
			<td>${u.machineid}</td>
			<td>${u.location}</td>
			<td>${u.description}</td>
				</tr>
			<c:set var="i" value="${i+1}" />
				</c:forEach>
                </tbody>
                </table> 
                 
                </div>
                    
                </div>

        </c:when>
        <c:when test="${mode=='showcomplain'}">
            <div class="container" id="homediv">
                <div class="jumbotron text-center">
                <div   align="center">
                    <H1>Complains</H1>
                <table border="1" style="width:100%"   cellpadding="10">
                	<thead>
                	
                		<tr>
                			<th>Complain ID</th>
                			<th>Machine ID</th>
                			<th>Location</th>
                			<th>Date</th>
                			<th>Description</th>
                			<th>Status</th>
                			<th>Action</th>		
                			
                		</tr>
                	</thead>
                <tbody>
               <c:set var="i" value="1" />
				<c:forEach items="${complainlist}" var="u" varStatus="status">
				<tr>
			
					<td>${u.complainid}</td>
					<td>${u.machineid}</td>
					<td>${u.location}</td>
					<td>${u.date}</td>
					<td>${u.description}</td>
					<td>${u.status}</td>
					<td><a href="<c:url value='/edit/${complainlist[status.index].complainid}' />" >Solve</a></td>
				</tr>
			<c:set var="i" value="${i+1}" />
				</c:forEach>
                </tbody>
                </table> 
                 <a href="<c:url value='/downloadcomplains'  />"
					class="btn btn-primary btn-sm"><i class="fas fa-file-excel"></i>
					Export all to Excel</a>
                </div>
                
                </div>
                </div>

        </c:when>
     
		<c:when test="${mode=='showrecurring'}">
            <div class="container" id="homediv">
                <div class="jumbotron text-center">
                <div   align="center">
                    <H1>Recurring</H1>
                <table border="1" style="width:100%"   cellpadding="10">
                	<thead>
                	
                		<tr>
                			<th>Bill ID</th>
                			<th>Bill No</th>
                			<th>Bill Issuer </th>
                			<th>Type</th>
                			<th>Available Quantity</th>
                			<th>Total Quantity</th>
                			<th>Description</th>
                			<th>Date</th>
                			<th>Unit Price</th>		
                			<th>Activity</th>
                		</tr>
                	</thead>
                <tbody>
               <c:set var="i" value="1" />
				<c:forEach items="${r}" var="u" varStatus="status">
				<tr>
			
					<td>${u.billid}</td>
					<td>${u.billno}</td>
					<td>${u.billissuer}</td>
					<td>${u.type}</td>
					<td>${u.available}</td>
					<td>${u.total}</td>
					<td>${u.description}</td>
					<td>${u.date}</td>
					<td>${u.unitprice}</td>
					<td><a href="<c:url value='/deleter/${r[status.index].billid}' />" >Delete</a></td>
				</tr>
			<c:set var="i" value="${i+1}" />
				</c:forEach>
                </tbody>
                </table> 
                 <a href="<c:url value='/downloadrecurring'  />"
					class="btn btn-primary btn-sm"><i class="fas fa-file-excel"></i>
					Export all to Excel</a>
                </div>
                
                </div>
                </div>

        </c:when>
		     

		<c:when test="${mode=='showfixedasset'}">
            <div class="container" id="homediv">
                <div class="jumbotron text-center">
                <div   align="center">
                    <H1>Fixed Assets</H1>
                <table border="1" style="width:100%"   cellpadding="10">
                	<thead>
                	
                		<tr>
                			<th>Bill ID</th>
                			<th>Bill No</th>
                			<th>Bill Issuer </th>
                			<th>Type</th>
                			<th>Quantity</th>
                			<th>Description</th>
                			<th>Date</th>
                			<th>Unit Price</th>	
                			<th>Action</th>	
                			
                		</tr>
                	</thead>
                <tbody>
               <c:set var="i" value="1" />
				<c:forEach items="${fa}" var="u" varStatus="status">
				<tr>
			
					<td>${u.billid}</td>
					<td>${u.billno}</td>
					<td>${u.billissuer}</td>
					<td>${u.type}</td>
					<td>${u.quantity}</td>
					<td>${u.description}</td>
					<td>${u.date}</td>
					<td>${u.unitprice}</td>
					<td><a href="<c:url value='/delete/${fa[status.index].billid}' />" >Delete</a></td>
				</tr>
			<c:set var="i" value="${i+1}" />
				</c:forEach>
                </tbody>
                </table> 
                 <a href="<c:url value='/downloadFixedAsset'  />"
					class="btn btn-primary btn-sm"><i class="fas fa-file-excel"></i>
					Export all to Excel</a>
                </div>
                
                </div>
                </div>

        </c:when>
        
         <c:when test="${mode=='allocate'}">
            <div class="container-fluid bg" >
            	<div class="row">
            		<div class="col-md-3 col-sm-3 col-xs-12"></div>
            		<div class="col-md-6 col-sm-6 col-xs-12">
            			<form class="form-container" method="POST" action="/saveAllocation">
            			<input type="hidden" name="allocateid" value="${allocation.allocateid}"/>   
            			  <div class="form-group">
			                 <label>Equipment Type</label>
			                   <select name=type id=type>
			                   	   <option value="Computer">Computer</option>
			                   	   <option value="Monitor">Monitor</option>
				                   <option value="CPU">CPU</option>
				                   <option value="Keyboard">Keyboard</option>
				                   <option value="Mouse">Mouse</option>
				                   <option value="Printer">Printer</option>
				                   <option value="AC">AC</option>
				                   <option value="Switch">Switch</option>
				                   <option value="Router">Router</option>
				                   <option value="Projector">Projector</option>
				                </select>
			              </div>    
			              <div class="form-group">
				              <label>Location</label>
				              <input type="text" class="form-control" name="location" value="${allocation.location}" id="location" placeholder="Location"> 
				          </div>
				          <div class="form-group">
				              <label>Machine id</label>
				              <input type="text" class="form-control" name="machineid" value="${allocation.machineid}" id="machineid" placeholder="Machine Id"> 
				          </div>
				           <button type="submit" class="btn btn-primary btn-block">Allocate</button>
				        </form>
           			</div>
           			<div class="col-md-3 col-sm-3 col-xs-12"></div>
            	</div>
        	</div>
        </c:when> 
         <c:when test="${mode=='allocateerror'}">
         	<form method="POST" action="/allocate">
         	<H2>The Equipment you just entered is not available in the inventory to allocate.</H2>
         	<!--  <a href="/allocate">Click here to return</a>-->
         	<H3>Click below button to return</H3>
         	<button type="submit">Return</button>
         	</form>
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
		              
    </c:choose>
</body>
</html>