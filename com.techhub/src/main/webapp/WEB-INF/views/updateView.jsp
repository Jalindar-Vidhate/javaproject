<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="home.jsp"></jsp:include>
<form action="finalupdate" method="post">

<input type="hidden" name="id" value="${id }">
<input type="text" name="name" value="${name }"><br>
<input type="text" name="salary" value="${salary }"><br>
<input type="text" name="deg" value="${deg }"><br>
<input type="text" name="address" value="${address }"><br>
<input type="submit" value="Update">

</form>
</body>
</html>