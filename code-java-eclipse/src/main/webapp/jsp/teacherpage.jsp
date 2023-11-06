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
		
		#c1 {
			position: absolute;
  			top: 60%;
  			left: 20%;
  			transform: translate(-50%, -50%);
  			padding: 50px 0;
			margin: 0 auto;
			width: 20%;
			text-align: center;
			background-color: #4682B4;
			border-radius: 20px;
			box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
		}
		
		
		#c2 {
			position: absolute;
  			top: 60%;
  			left: 80%;
  			transform: translate(-50%, -50%);
  			padding: 50px 0;
			margin: 0 auto;
			width: 20%;
			text-align: center;
			background-color: #4682B4;
			border-radius: 20px;
			box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
		}
		
			#c3 {
			position: absolute;
  			top: 60%;
  			left: 50%;
  			transform: translate(-50%, -50%);
  			padding: 50px 0;
			margin: 0 auto;
			width: 20%;
			text-align: center;
			background-color: #4682B4;
			border-radius: 20px;
			box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
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
		
	</style>
</head>
<body>
	
		
		<div class="main-content">
			<h1>Welcome ${firstname}</h1>
			<p>Enjoy your journey at Learning Management System. </p>
			<p></p>
		</div>
		
		
		
			
<div class="container" id="c1">	
	<div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title" id="title">Notes</h5>
    <p class="card-text">Enter Course Notes</p>
        <a href="adddetails" class="btn btn-primary">Enter</a>
  </div>
</div>
</div>


<div class="container" id="c3">	
	<div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title" id="title">Assignments</h5>
    <p class="card-text">Post an assignment</p>
    <a href="assignassignment" class="btn btn-primary">Post</a>
  </div>
</div>
</div>



<div class="container" id="c2">	
	<div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title" id="title">Logout</h5>
    <p class="card-text"></p>
    <a href="hometeacher.jsp" class="btn btn-primary">Logout</a>
  </div>
</div>
</div>
		
		
		


	
	
	
	</body>
</html>