<%@page import="com.quest.bloodbankspring.models.Users"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!Doctype html>
<html>
<head>
<title>Edit User</title>
<link rel="stylesheet" href="/CSS/RegisterBlood.css">
<style>
</style>
</head>
<body>
	<%
	Users user = (Users)request.getAttribute("user");
	%>
	<div class="container1">
		<h1>Blood Bank</h1>
	</div>
	<div>
		<div class="container2">
			<h1>Edit Profile</h1>
			<form action="/edituser" method="post">
				<input type="hidden" name="id" value="<%=user.getId()%>">
				<input type="text" id="firstname" name="firstname" value="<%=user.getFirstname() %>" pattern="[A-Za-z]{2,}" title="Only use letters" required>
				<input type="text" id="lastname" name="lastname" value="<%=user.getLastname()%>" pattern="[A-Za-z]{0,}" title="Only use letters"> 
				<input type="text" id="contact" name="contact" value ="<%=user.getContact() %>" placeholder="Phone number" pattern="[0-9]{10,10}" title="Only use 10 digit numbers" required>
				<input type="email" id="email" name="email" value="<%=user.getEmail()%>" required readonly>
				<input type="text" id="username" name="username" value="<%=user.getUsername()%>" placeholder="User Name" required readonly>
				<input type="password" id="password" name="password" value="<%=user.getPassword()%>" placeholder="password" pattern="[A-Za-Z0-9]{8,16}" required readonly>
				<input type="password" id="repassword" value="<%=user.getPassword()%>" placeholder="Re-enter password" required readonly> <br>
				<input id="edit" type="submit" onclick="return validatePassword()" value="Edit"> <br>
			</form>
			<br><a href="Home-login">&nbsp> Back</a>
		</div>

	</div>
	
	<script type="text/javascript">function validatePassword() {
		  const password = document.getElementById("password").value;
		  const reEnterPassword = document.getElementById("repassword").value;

		  if (password === "" || repassword === "") {
		    alert("All fields are required.");
		    return false;
		  }

		  if (password !== reEnterPassword) {
		    alert("Passwords do not match.");
		    return false;
		  }

		  return true;
		}
	
	</script>
	
</body>
</html>