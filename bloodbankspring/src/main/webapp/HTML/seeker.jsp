<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Find Donor</title>
  <link rel="stylesheet" href="/CSS/seeker.css">
  
  
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

  <div class="container">
    <h1 class="heading">FIND BLOOD DONORS</h1>
        <div class="contact-box">
                <form action="findDonors.jsp" method= "post"><h1>Seeker's Details</h1>
                  <div class="input-row">
                    <div class="input-group">
                      <label>Seeker First Name:</label>
                      <input name="seekerFName" type="text" placeholder="Enter Fist Name" required>
                    </div>
                    <div class="input-group">
                      <label>Seeker Last Name:</label>
                      <input name="seekerLName" type="text" placeholder="Enter Last Name" required>
                    </div>
                    <div class="input-group4">
                      <label required>Blood Group:</label>
                      <select name="seekerBloodType">
                        <option disabled selected>--Select Blood Group--</option>
                        <option value="A-">A-</option>
                        <option value="A+">A+</option>
                        <option value="AB-">AB-</option>
                        <option value="AB+">AB+</option>
                        <option value="B-">B-</option>
                        <option value="B+">B+</option>
                        <option value="O-">O-</option>
                        <option value="O+">O+</option>
                      </select>
                    </div>
                  </div>

                 
                 
                  <br><br>
                  <button type="submit" >Find Donor</button>
                </form>
        
          </div>
  </div>

  <footer>
    <p>Copyright &copy; 2023 Blood Bank Management System</p>
  </footer>

</body>
</html>