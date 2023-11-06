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
		
		h5{
		color: #fff;
		}
		
		p{
		color: #000000;
		font-size: 25px;
		}
		
		a{
		color: #fff;
		}
		
		#title{
				font-size: 30px;
		
		}
		
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
			background-color: #fff;
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
			background-color: #fff;
			color: #4682B4;
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
		
	</style>
</head>
<body>





<div class="container">
		<div class="sidebar">
			<h2>Menu</h2>
			<ul>
				<li><a href="courseliststudent">View Course List</a></li>
				<li><a href="coursenotes">View Course Notes</a></li>				
				
				<li><a href="homestudent.jsp">Logout</a></li>
			</ul>
		</div>
			
	
		<div class="main-content">
			<h1>Welcome ${firstname}</h1>
			<p>Enjoy your journey at Learning Management System. </p>
			<p> Learning made fun and easier. </p>
		</div>
		</div>
		
		



	









































	




	
	
	
	
	</body>
</html>