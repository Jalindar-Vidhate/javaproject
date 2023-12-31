<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <style type="text/css">
        
        ul {
        background-color: red;
        color: white;
        width: 100%;
        height: 60px;
        padding: 20px;
        }
        ul li{
        
        padding: 30px;
        display: inline;
        }
        
        ul li a{
        
        color: white;
        
        }
        
        </style>
    </head>
    <body>
        <div id="navbar">
        <ul>
        	<li><a href="insert">Insert</a></li>
        	<li><a href="update">update</a></li>
        	<li><a href="delete">Delete</a></li>
        	<li><a href="select">Select</a></li>
        </ul>
        </div>
        
    </body>
</html>
