<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!Doctype html>
<html>
<head>
<title>Register</title>
<link rel="stylesheet" href="/CSS/RegisterBlood.css">
<style>
</style>
</head>
<body>

	<div class="container1">
		<h1>Blood Bank</h1>
	</div>
	<div>
		<div class="container2">
			<h1>Register</h1>
			<form action="Register" method="post">
				 
				<input type="text" id="firstname" name="firstname" placeholder="First Name" pattern="[A-Za-z]{2,}" title="Only use letters" required>
				<input type="text" id="lastname" name="lastname" placeholder="Last Name" pattern="[A-Za-z]" title="Only use letters">
				<input type="text" id="contact" name="contact" placeholder="Phone number" pattern="[0-9]{10,10}" title="Only use 10 digit numbers" required>
				<input type="email" id="email" name="email" placeholder="email" pattern="[a-z,0-9._%+-]+@[a-z]+\.[a-z]{2,}$" title="Should be in this formate - name@domain.tld" required>
				<input type="text" id="username" name="username" placeholder="User Name" pattern="[A-Za-Z0-9]{2,16}" required>
				<input type="password" id="password" name="password" placeholder="password" pattern="[A-Za-Z0-9]{8,16}" required>
				<input type="password" id="repassword" placeholder="Re-enter password" required> <br>
				<input id="register" type="submit" onclick="return validatePassword()" value="Register"> <br>
			</form>
			<br> <b>Already have an account?</b> <a
				style="color: #2a92ee; text-decoration: none;" href="login"
				onmouseover="this.style.color='red'"
				onmouseout="this.style.color='#2a92ee'">Login here</a>

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