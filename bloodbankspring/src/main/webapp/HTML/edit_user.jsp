<%@page import="com.quest.bloodbankspring.models.Users"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!Doctype html>
<html>
<head>
<title>User Info</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/CSS/homeadmin.css">


<style>
</style>
</head>


<body>
<header>
    <h1>Blood Bank</h1>
    <nav id="home-menu-btn">
      
        <a href="/admin/users">Go Back To User</a>
       
    </nav>
  </header>
  
  <%
	
  response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	response.setDateHeader("Expires", -1);
	
	Users user = (Users)request.getAttribute("user");
	
	%>



	<h1>Edit Profile</h1>
  	<pre><b>           Id                       UserName                   Password                   Contact                   Firstname                  LastName                    Email   </b>     </pre>
   	<form action="/admin/update/user" method="POST">
   	
   	
   
   		   	<input style="background-color: black;color:white; " type="text" id="id" name="id" value="<%=user.getId()%>" placeholder="UserName" title="UserName" required readonly>	   
   		   	
		<input style="background-color: black;color:white; " type="text" id="username" name="username" value="<%=user.getUsername()%>" placeholder="UserName" title="UserName" required readonly>
		
		<input style="background-color: black;color:white; "type="text" id="password" name="password" value="<%=user.getPassword()%>" placeholder="Password" title="Password" required>  
		
		<input style="background-color: black;color:white; "type="text" id="contact" name="contact" value="<%=user.getContact()%>" placeholder="Contact" title="Password" required> 
		
		<input style="background-color: black;color:white; " type="text" id="firstname"name="firstname" value="<%=user.getFirstname()%>" placeholder="Firstname" title="Firstname" required>
		
		<input style="background-color: black;color:white; "type="text" id="lastname" name="lastname" value="<%=user.getLastname()%>" placeholder="Lastname" title="Lastname" required>
		
		<input style="background-color: black;color:white; "type="text" id="email" name="email" value="<%=user.getEmail()%>" placeholder="Email" title="Email" required readonly>
   		
   		
   		<button style="background-color: green;color:white; "type="submit" title="Click to update User">Update</button>
   		
   		
	 </form>

	<br>
	<br>

	
</body>
</html>