<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>My Website</title>
	<style>
		body {
			background-color: #ADD8E6;
			font-family: Arial, sans-serif;
		}
		.container {
			max-width: 800px;
			margin: 0 auto;
			padding: 20px;
		}
		h1 {
			font-size: 40px;
			color: #000000;
			text-align: center;
			margin-top: 150px;
			margin-bottom: 50px;
		}
		.link-container {
			display: flex;
			justify-content: space-between;
			align-items: center;
			margin-top: 150px;
		}
		.link {
			background-color: #4682B4;
			color: #ffffff;
			font-size: 24px;
			padding: 20px;
			border-radius: 15px;
			text-decoration: none;
			transition: all 0.3s ease;
			box-shadow: 0 3px 6px rgba(0,0,0,0.1);
		}
		.link:hover {
			background-color: #fff;
			color: #4682B4;
			box-shadow: 0 6px 12px rgba(0,0,0,0.15);
			transform: translateY(-3px);
		}
	</style>
</head>
<body>
	<div class="container">
		<h1>Student Portal</h1>
		<div class="link-container">
			<a href="loginstudent" class="link">Login</a>
			<br>
			<a href="registerstudent" class="link">Register</a>
			<br>
			<a href="index.jsp" class="link">Main-page</a>
		</div>
	</div>
</body>
</html>