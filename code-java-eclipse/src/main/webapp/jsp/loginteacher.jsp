<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Teacher Login</title>
    <style>
    
      body {
			background-color: #ADD8E6; 
			font-family: Arial, Helvetica, sans-serif;
		}
        /* Center the form on the page */
        form {
            margin: 0 auto;
            width: 50%;
        }
        /* Increase the size of the input fields */
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 2px solid #ccc;
            border-radius: 4px;
        }
        /* Style the login button */
        button {
            background-color: #4682B4;
            color: #ffffff;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #ffffff;
            color: #4682B4
        }
        /* Style the link to the home page */
        a {
            color: #000000;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
        /* Style the error message */
        #message {
            color: red;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <form:form id="loginForm" modelAttribute="loginteacher" action="loginteacherProcess" method="post">
        <div>
            <h1>Teacher Login</h1>
            <div>
                <form:label path="username">User name:</form:label>
                <form:input path="username" name="username" id="username" />
            </div>
            <div>
                <form:label path="password">Password:</form:label>
                <form:password path="password" name="password" id="password" />
            </div>
            <div>
                <button type="submit" id="login" name="login">Login</button>
            </div>
            <div>
                <a href="hometeacher.jsp">Home</a>
            </div>
            <div>
                <span id="message">${message}</span>
            </div>
        </div>
    </form:form>
</body>
</html>