<%@ page session="false" import="projectpkg.*" errorPage="Login.jsp" %>
 
<%
		PersonDAO pd = new PersonDAO();
		Personinfo pi = new Personinfo();
		String email = (String) request.getSession(false).getAttribute("email");
		pi=pd.profile(email);%>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style2.css">
        <link rel="stylesheet" href="style3.css">
        <title>Sign Up</title>
        
    </head>
    <body>
        <header><div class="overlay">
            <h1>Gamers Zone</h1>
        </div>
</header>
<nav >
    
    <form action="home" method="post"><input type="submit" id="n1" value="Home"></form>
    <form action="Enroll.jsp"><input type="submit" id="n2" value="Enroll"></form>
    <form action=""><input type="submit" id="n3" value="Search"></form>
    <form action=""><input type="submit" id="n4" value="Friends"></form>
    <form action="Profile.jsp"><input type="submit" id="n5" value="Profile"></form>
    <form action="validate"><input type="submit" id="n7" name="action" value="Logout" ></form>
    
</nav>
        <main>
        <table style="width: 700px; margin-left: auto;margin-right: auto; font-weight: bolder;">
            <form name="user" method="post" action="validate">
                <tr>
              <td align="center">
              <p>Enter Gamer ID: <input style="color: aliceblue;" id="ID" type="text" name="id" value="<%out.println(pi.ID); %>" readonly  >  </p>
              </td>
                </tr>
                <tr>
                    <td align="center">
              <p>First Name: <input id="ID" style="color: aliceblue;" type="text" name="fname" value="<%out.println(pi.first); %>"  readonly> </p>
              </td>
            </tr>
              <tr>
              <td align="center">
              <p>Last Name:<input id="ID" style="color: aliceblue;" type="text" name="lname" value="<%out.println(pi.last); %>" readonly> </p>
            </td>
        </tr>
        <tr>
            <td align="center">
              <p>Email: <input id="ID" style="color: aliceblue;" type="email" name="email" value="<%out.println(pi.Email); %>" readonly> </p>
            </td>
        </tr>
        <tr>
            <td align="center">
              <p> Password: <input id="ID" style="color: aliceblue;" type="text" name="password" value="<%out.println(pi.Password); %>" readonly> </p>
            </td>
        </tr>
        <tr>
            <td align="left">
              <p><input type="submit" name="action" value="Delete Profile"  style="position: absolute; margin-left: 20%;"> </p>
              
            </td>
        </tr>
            </form>
        </table>
        </main>
        <footer>
            <a href="complaints.html">FAQ/Complaints</a>
            <a href="#">Contact Us</a>
            <a href="#">Terms of Use</a>
            <a href="#">Privacy Policy</a>
            <a href="#">Refund Policy</a>
            <a href="#">&copy; 2021 | Reapers Streaming</a>
        </footer>
    
    </body>
    </html>