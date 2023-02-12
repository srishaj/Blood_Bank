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
      
        <a href="/admin/users">User</a>
        |
        <a href="/admin/donors">Donor</a>
        |
        <a href="/admin/seekers">Seeker</a>
        |
        <a href="/">Logout</a>
 
    </nav>
  </header>


	<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	response.setDateHeader("Expires", -1);

	List<Users> uses = (List<Users>) request.getAttribute("users");
	%>

	
	<br>

	<h1>User Info</h1>

	

	<br>
	<br>

	<table class="table table-striped table-dark">
		<thead>
			<tr>
				<th>ID</th>
				<th>UserName</th>
				<th>password</th>
				<th>Contact</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>


			<%
			for (Users a : uses) {
			%>
			<tr>
				<td><%=a.getId()%></td>
				<td><%=a.getUsername()%></td>
				<td><%=a.getPassword()%></td>
				<td><%=a.getContact()%></td>
				<td><%=a.getFirstname()%></td>
				<td><%=a.getLastname()%></td>
				<td><%=a.getEmail()%></td>
				<td><a class = "btn btn-primary" href="/admin/user/edit/<%=a.getId()%>">
						Update</a></td>
				<td><a class = "btn btn-primary" href="/admin/users/<%=a.getId()%>">
						Delete</a></td>
				
			</tr>
			
			<%
			}
			%>



		</tbody>

	</table>
	


			<%
			int b=0;
			for (Users a : uses) {
				b++;
			}
			%>
			
				
				
			
			<div style="margin: auto;width: 10%;">
			<div class="card text-white bg-primary mb-3" >
  <div class="card-header">Number of Users</div>
  <div class="card-body">
    <h3 class="card-title"><%=b%></h3>
    </div>
    </div>



		
</body>
</html>