<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test Results</title>
	<style>
		body {
			margin: 0;
			padding: 0;
			background-color: #f5f5f5;
			font-family: Arial, sans-serif;
		}
		
		.container {
			display: flex;
			flex-direction: row;
			height: 100vh;
			background-color: #fff;
			box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
		}
		
		.sidebar {
			flex: 0 0 20%;
			background-color: #333;
			color: #fff;
			padding: 20px;
		}
		
		.sidebar h2 {
			margin-top: 0;
			font-size: 20px;
			font-weight: normal;
			margin-bottom: 20px;
			text-align: center;
		}
		
		.sidebar ul {
			list-style: none;
			padding: 0;
			margin: 0;
		}
		
		.sidebar li {
			margin-bottom: 10px;
		}
		
		.sidebar a {
			color: #fff;
			text-decoration: none;
			display: block;
			padding: 10px;
			border-radius: 5px;
			transition: background-color 0.3s ease;
		}
		
		.sidebar a:hover {
			background-color: #555;
		}
		
		.main-content {
			flex: 1;
			padding: 20px;
		}
		
		.main-content h1 {
			margin-top: 0;
			font-size: 36px;
			margin-bottom: 20px;
			text-align: center;
		}
		
		.main-content form {
		  display: flex;
		  flex-direction: column;
		  align-items: center;
		  margin-top: 50px;
		}
		
		.main-content label {
		  font-size: 18px;
		  margin-bottom: 10px;
		}
		
		.main-content select {
		  font-size: 16px;
		  padding: 8px;
		  border: none;
		  border-radius: 5px;
		  margin-bottom: 20px;
		  width: 100%;
		}
		
		.main-content input[type="submit"] {
		  background-color: #4CAF50;
		  color: white;
		  padding: 12px 20px;
		  border: none;
		  border-radius: 5px;
		  cursor: pointer;
		  font-size: 16px;
		}
		
		.main-content input[type="submit"]:hover {
		  background-color: #3e8e41;
		}
					
	</style>
</head>
<body>
	<div class="container">
		<div class="sidebar">
			<h2>Menu</h2>
			<ul>
				<li><a href="choosetopic">Attempt Test</a></li>
				<li><a href="resultlist">View Past Results</a></li>
				<li><a href="logout">Logout</a></li>
			</ul>
		</div>
		<div class="main-content">
			<h1>Generate Test Paper</h1>
			<form method="post" action="testpaper">
				<label for="topic">Select Topic:</label>
				<select id="topic" name="topic">
					<c:forEach items="${topics}" var="topic">
						<option value="${topic}">${topic}</option>
					</c:forEach>
				</select>
				<input type="submit" value="Generate Test">
			</form>

	    	</div>
	    </div>
</body>
</html>