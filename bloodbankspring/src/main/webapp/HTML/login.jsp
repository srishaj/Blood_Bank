<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Login</title>
  <link rel="stylesheet" href="/CSS/LoginBlood.css">
</head>
<body>

  <div class="heading">
  <h1>Blood Bank</h1>
</div>
  <div class="container">
 
    <h1>Login</h1>

    <form action="login" method="post">
      <input type="text" id="username" name="username" placeholder="Username" required>
      <input type="password" id="password" name="password" placeholder="Password" required="required">
      <input type="submit" value="Login"><br>
      <a href="passwordRequestPopup">Forget Password ?</a>
    </form>
	
  </div>
  
</body>
</html>