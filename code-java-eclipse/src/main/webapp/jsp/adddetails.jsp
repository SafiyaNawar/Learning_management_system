<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
<head>
	<title>Welcome Page</title>
	<style>
		body {
			margin: 0;
			padding: 0;
			background-color: #ADD8E6;
			font-family: Arial, sans-serif;
		}
		
		.container {
			display: flex;
			flex-direction: row;
			height: 100vh;
			background-color: #ADD8E6;
			box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
		}
		
		.sidebar {
			flex: 0 0 20%;
			background-color: #4682B4;
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
		
		form {
			margin-top: 20px;
			display: flex;
			flex-direction: column;
			align-items: center;
		}

		label {
			font-size: 18px;
			font-weight: bold;
			margin-bottom: 10px;
			display: block;
			text-align: center;
		}

		input[type=text] {
			width: 100%;
			padding: 12px 20px;
			margin: 8px 0;
			box-sizing: border-box;
			border: none;
			border-radius: 4px;
			background-color: #f1f1f1;
		}

		input[type=submit] {
			background-color: #4CAF50;
			color: white;
			padding: 12px 20px;
			border: none;
			border-radius: 4px;
			cursor: pointer;
			font-size: 18px;
			margin-top: 20px;
		}

		input[type=submit]:hover {
			background-color: #45a049;
		}
		
	</style>
</head>
<body>
	<div class="container">
		<div class="sidebar">
			<h2>Menu</h2>
			<ul>
				
				<li><a href="courselistteacher">View Course List</a></li>
				<li><a href="coursenotesteacher">View Course Notes</a></li>
				<li><a href="adddetails">Add Course Notes</a></li>
				<li><a href="hometeacher.jsp">Logout</a></li>
			</ul>
		</div>
		<div class="main-content">
			<h1>Add Course Details</h1>
	<form modelAttribute="crs" action="addCrsProcess" method="post">
	
	    <label for="idcrs">Course ID:</label><br>
		<input type="text" id="idcrs" name="idcrs" required><br>
		
		<label for="namecrs">Course Name:</label><br>
		<input type="text" id="namecrs" name="namecrs" required><br>				
		
		<label for="unit1">Unit1 Summary:</label><br>
		<input type="text" id="unit1" name="unit1" ><br>
		
		<label for="unit1=2">Unit2 Summary:</label><br>
		<input type="text" id="unit2" name="unit2" ><br>
		
				
		<input type="submit" value="Submit">
	</form>
		</div>
	</div>
</body>
</html>