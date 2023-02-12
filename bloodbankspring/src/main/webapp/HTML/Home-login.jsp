<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Blood Bank Management System</title>
  <link rel="stylesheet" type="text/css" href="/CSS/home-login.css">
</head>
<body>
	<%
			response.setHeader("Pragma", "No-cache");
		    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		    response.setDateHeader("Expires", -1);
		    
		    if(session.getAttribute("id")==null){
		    	response.sendRedirect("login");
		    }
		
	%>
  <header>
    <h1>Blood Bank</h1>
    <nav id="home-menu-btn">
      	
      	<br>Welcome :) &nbsp${name} &nbsp | &nbsp<a href="edituser">Edit Profile</a><br><br>
        <a href="Home-login">Home</a>
        |
        <a href="donateblood">Donate Blood</a>
        |
        <a href="seeker">Find Donor</a>
        |
        <a href="contact">Contact Us</a>
        |
 		<a href="/logout">Logout</a>
 		
    </nav>
  </header>
  <div>
  <main>
    <video autoplay muted loop id="myVideo">
      <source src="/Images/blood.mp4" type="video/mp4">
    </video>
  </main>
  </div>

  <footer>

    <h5>Copyright &copy; 2023 Blood Bank Management System</h5>
    <nav id="home-menu-btn">
    <a href="aboutus"> About-Us </a>|
    </nav>
  </footer>

</body>
</html>