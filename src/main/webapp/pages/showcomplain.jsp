<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Complains</title>
</head>
<body>
				<div   align="center">
                    <H1>Complains</H1>
                <table border="1" style="width:100%"   cellpadding="10">
                	<thead>
                	
                		<tr>
                			<th>Complain ID</th>
                			<th>Student ID</th>
                			<th>Sem  </th>
                			<th>Batch</th>
                			<th>Date</th>
                			<th>Description</th>
                			<th>Machine ID</th>
                			<th>Location</th>
                			
                		</tr>
                	</thead>
                <tbody>
               <c:set var="i" value="1" />
				<c:forEach items="${complainlist}" var="u">
				<tr>
			
			<td>${u.complain_id}</td>
			<td>${u.sid}</td>
			<td>${u.sem}</td>
			<td>${u.batch}</td>
			<td>${u.machineid}</td>
			<td>${u.location}</td>
			<td>${u.date}</td>
			<td>${u.description}</td>
				</tr>
			<c:set var="i" value="${i+1}" />
				</c:forEach>
                </tbody>
                </table> 
                 
                </div>
</body>
</html>