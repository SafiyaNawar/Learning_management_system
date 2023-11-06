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
    padding: 20px;
    background-color: #fff;
    border-radius: 10px;
    box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
}

.main-content table {
  margin-top: 30px;
  border-collapse: collapse;
  width: 100%;
  margin-bottom: 20px;
}

.main-content table tr:nth-child(even) {
  background-color: #f2f2f2;
}

.main-content table tr:hover {
  background-color: #ddd;
}

.main-content table td {
  padding: 8px; /* reduced padding */
  text-align: left;
  font-size: 14px; /* decreased font size */
}

.main-content table td:first-child {
  font-weight: bold;
}

.main-content input[type=radio] {
  margin-right: 10px;
}

.main-content input[type=submit] {
  margin-top: 20px;
  background-color: #4CAF50;
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  font-size: 12px;
  transition: background-color 0.3s ease;
}

.main-content input[type=submit]:hover {
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
			<c:if test="${not empty questions}">
				<form method="post" action="testresult">
					<table>
						<c:forEach items="${questions}" var="question" varStatus="loop">
						    <tr>
							<td>${question.question}</td>
						    </tr>
						    <tr>
							<td><input type="radio" name="answer${loop.index}" value="${question.option1}">${question.option1}</td>
						    </tr>
						    <tr>
							<td><input type="radio" name="answer${loop.index}" value="${question.option2}">${question.option2}</td>
						    </tr>
						    <tr>
							<td><input type="radio" name="answer${loop.index}" value="${question.option3}">${question.option3}</td>
						    </tr>
						    <tr>
							<td><input type="radio" name="answer${loop.index}" value="${question.option4}">${question.option4}</td>
						    </tr>
						    <input type="hidden" name="question${loop.index}" value="${question.question}">
						    <input type="hidden" name="actualAnswer${loop.index}" value="${question.answer}">
						</c:forEach>
						<input type="hidden" name="topic" value="${chosentopic}">
					</table>
					<input type="submit" value="Submit Test">
				</form>
			</c:if>

	    	</div>
	    </div>
</body>
</html>