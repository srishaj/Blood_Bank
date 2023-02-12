<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!Doctype html>
<html>
<head>
<link rel="stylesheet" href="/CSS/popup.css">
</head>
<body>

<div id="popup">
    <div class="popup-content">
      <p><form action="/forgotPassword" method="post">
					<input type="text" id="email" name="email"
						placeholder="Enter your email" required> <input
						type="submit" value="Submit"><br>
						(you will get a mail after submitting)
				</form></p>
      <h4><a id="close-popup"
				style="color: #fbfbfb; text-decoration: none;" href="login"
				onmouseover="this.style.color='chartreuse'"
				onmouseout="this.style.color='#fbfbfb'"> &nbsp &nbsp &nbsp &nbsp &nbsp > Back</a></h4>
    </div>
  </div>



</body>
</html>