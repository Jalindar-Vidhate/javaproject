<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href='<c:url value="/resources/Css/style.css"></c:url>' rel="stylesheet">
</head>
<body>
<jsp:include page="home.jsp"></jsp:include>
<form action="btn" method="post">

<input type="text" name="name"><br>
<input type="text" name="salary"><br>
<input type="text" name="deg"><br>
<input type="text" name="address"><br>
<input type="submit" value="Add Employee" class="controll">

</form>

     
</body>
</html>