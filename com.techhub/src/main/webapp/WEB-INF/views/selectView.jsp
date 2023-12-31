<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src='<c:url value="/resources/Js/ajaxCall.js"></c:url>'></script>
</head>
<body>
	<jsp:include page="home.jsp"></jsp:include>
	<input type="text" value="" onkeyup="ajax(this.value)"><br>
	<div id="b">
     <table border="1">
		<tr><th>Name</th><th>Salary</th><th>Deg</th><th>Address</th></tr> 
   <c:forEach var="i" items="${data}">
   
     
		<tr><th>${i.getName()}</th><th>${i.getSalary() }</th><th>${i.getDeg() }</th><th>${i.getAddress() }</th><th><a href="update?empId=${i.getId() }&name=${i.getName()}&salary=${i.getSalary()}&deg=${i.getDeg()}&address=${i.getAddress()}">Update</a></th><th><a href="delete?empId=${i.getId()}">Delete</a></th></tr> 
  
   </c:forEach>
    </table>
    </div>
</body>
</html>