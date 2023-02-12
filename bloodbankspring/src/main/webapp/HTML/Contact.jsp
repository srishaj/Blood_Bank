<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Contact Us, Blood Bank</title>
  <link rel="stylesheet" type="text/css" href="/CSS/contact.css">
    <script>
  function showAlert() {
    var myText = "Thank your message has been successfully received! \nYou may return to home.";
    alert (myText);
  }
  

  </script>
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
    
    <h1>Contact Us</h1>
    <p>Donating blood is an act of solidarity.</p>
        <div class="contact-box">
            <div class="contact-left">
                <h3>Send your request</h3>
                <form class="contact-form" method="post">
                  <div class="input-row">
                    <div class="input-group">
                      <label for="name">Name:</label>
                      <input type="text" id="name" class="input-group1" placeholder="Enter Name" maxlength="50">
                    </div>
                    <div class="input-group">
                      <label for="phone">Phone:</label>
                      <input type="tel" id ="phone"class="input-group1" id="phone" name="phone" pattern="[6-9]{1}[0-9]{9}" placeholder="Enter Mobile Number">
                    </div>
                  </div>

                  <div class="input-row">
                    <div class="input-group">
                      <label for="email">Email:</label>
                      <input type="email" id="email" class="input-group1" placeholder="Enter Email" pattern="[A-Za-z]+@[A-Za-z]+.[A-Za-z]+" required>
                    </div>
                    <div class="input-group">
                      <label for="sub">Subject:</label>
                      <input type="text" id="sub" class="input-group1" placeholder="Enter Subject" maxlength="100">
                    </div>
                  </div>
                  
                  <label for="msg">Message:</label>
                  <textarea rows="7" id="msg" placeholder="Enter Your Message" maxlength="500"></textarea>
                  <br><br>
                 <button type="submit" >Send Message</button>
                  
                </form>
            </div>
            <div class="contact-right">
                <h3>Reach Us</h3>

                <table>
                  <tr>
                    <td>Email:</td>
                    <td>bloodbank276@gmail.com</td>
                  </tr>
                  <tr>
                    <td>Phone: </td>
                    <td>+91 998 078 2453</td>
                  </tr>
                  <tr>
                    <td>Website:</td>
                    <td>bloodbank.com</td>
                  </tr>
                  <tr>
                    <td>Address:</td>
                    <td>Block 7b, Primrose Tower,<br>
                      Embassy Tech Village, Bengaluru,<br>
                      Sarjapura Marathahalli Outer Ring Road,<br>
                      Devarabeesanahalli-Bellandur-560103.
                     </td>
                  </tr>
                </table>
            </div>
        </div>

  </div>

  <footer>
    <p>Copyright &copy; 2023 Blood Bank Management System</p>
  </footer>
<script src="https://smtpjs.com/v3/smtp.js"></script>
<script>
  function sendMail(){
    Email.send({
    Host : "smtp.gmail.com",
    Username : "bloodbank276@gmail.com",
    Password : "bloodbank123",
    To : 'bloodbank276@gmail.com',
    From : document.getElementById("email").value,
    Subject : "The Contact Form enquiry",
    Body : "Name:"+document.getElementById("name").value
    +"<br>Phone No: "+document.getElementById("phone").value
    +"<br>Email: "+document.getElementById("email").value
    +"<br>Subject: "+document.getElementById("sub").value
    +"<br>Message: "+document.getElementById("msg").value
}).then(
  message => alert("Message sent successfully\nYou may return to home")
);
  }
</script>

	<!-- <script type="text/javascript">
	
	const form = document.getElementById('contact-form');
form.addEventListener('submit', (event) => {
  event.preventDefault();
  const formData = new FormData(form);
  const request = new XMLHttpRequest();
  request.open('POST', 'index.html');
  request.send(formData);
  form.reset();
  alert('Message sent successfully');
});
</script> -->

</body>
</html>