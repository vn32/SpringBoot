<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<p> Welcome to Login Page! </p>
<pre> ${errorMessage} </pre>
<form method="post">
  <div class="container">
    <label for="name"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="name" required>

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>

    <button type="submit">Login</button>
  </div>
</form>
</body>
</html>