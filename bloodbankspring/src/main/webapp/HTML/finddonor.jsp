<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.quest.bloodbankspring.models.Donor"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Find Donors, Blood Bank</title>
<link rel="stylesheet" href="/CSS/findDonar.css">
</head>
<body>

	<%
		List<Donor> donors = (List<Donor>) request.getAttribute("donors");
		String bloodType = (String)request.getAttribute("bloodType");
	%>
	
	<h1>Donors of Blood Type : <%=bloodType %></h1>
	<table>
		<thead>
			<tr>
				<th>First Name</th>
				<th>Email</th>
				
			</tr>
			
			
		</thead>
		<tbody>
			<% for(Donor donor: donors) { %>
				<tr>
					<td> <%= donor.getFirstname() %> </td>
					<td> <%= donor.getEmail() %> </td>
					
				</tr>
			<% } %>
		</tbody>
	</table>
	

</body>
</html>