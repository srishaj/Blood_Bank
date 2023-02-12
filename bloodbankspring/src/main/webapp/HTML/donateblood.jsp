<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Blood Bank Management System</title>
  <link rel="stylesheet" type="text/css" href="/CSS/donateblood.css">
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
    <div class= "donorRegistrationForm" >
  <main>
    <form action="/donate" method="POST">
      <h1 class = "frm-title">Blood Donation Form</h1>
      <input type="text" placeholder="First Name" name = "firstname" required>
      <br>
      <input type="text"  placeholder="Last Name" name = "lastname" required>
      <br>
      <input type="email" placeholder="Email" name = "email" required>
      <br>
      <input type="number" placeholder="Age" name = "age" required>
      <br>
      <input type="number" placeholder="Weight" name = "weight" required>
      <br>
      <input type="number" placeholder="Contact" name = "contact" required>
      <br>
      <input type="text" placeholder="City" name = "city" required>
      <br>
       <b>Gender:</b> <input  type="radio" name="gender" value="male"> Male
      <input type="radio" name="donorGender" value="female">  Female <br> <br>

      <select id="bloodtype" placeholder="BloodType" name = "bloodtype" required> 
        <option value="">Select Blood Type</option>
        <option value="A+">A+</option>
        <option value="B+">B+</option>
        <option value="AB+">AB+</option>
        <option value="O+">O+</option>
        <option value="A-">A-</option>
        <option value="B-">B-</option>
        <option value="AB-">AB-</option>
        <option value="O-">O-</option>
      </select>
      <br>
      <input type="submit" value="Submit">
    </form>
  </main>
  </div>
  
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