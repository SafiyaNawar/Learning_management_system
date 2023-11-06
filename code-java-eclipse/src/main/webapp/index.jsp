<!DOCTYPE html>
<html>
<head>
	<title>Learning Management System</title>
	<style>
		body {
			background-color: #ADD8E6; 
			font-family: Arial, Helvetica, sans-serif;
		}
		
		.container {
			position: absolute;
  			top: 50%;
  			left: 50%;
  			transform: translate(-50%, -50%);
  			padding: 50px 0;
			margin: 0 auto;
			width: 60%;
			text-align: center;
			background-color: #4682B4; 
			border-radius: 20px;
			box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
		}
		
		h1 {
			color: #ffffff;
			font-size: 46px;
			margin-bottom: 20px;
		}
		
		button {
			background-color: #000000;
			color: #fff;
			padding: 12px 24px;
			border: none;
			border-radius: 15px;
			font-size: 18px;
			margin: 10px;
			cursor: pointer;
			transition: background-color 0.3s ease;
		}
		
		button:hover {
			background-color: #fff;
			color: #000000;
		}
		
		img {
			max-width: 100%;
			height: auto;
			margin: 20px 0;
		}
	</style>
</head>
<body>
	<div class="container">
		<h1>Learning Management System</h1>
		<br>
		<br>
		<br>
		<button onclick="location.href='home.jsp'">I am the Administrator</button>
		<br>
		<button onclick="location.href='hometeacher.jsp'">I am a Teacher</button>
		<br>
		<button onclick="location.href='homestudent.jsp'">I am a Student</button>
	</div>
</body>
</html>
