 <%@ page session="false" errorPage="Login.jsp" %>
 <%if(request.getSession(false) == null){
	 				response.sendRedirect("Login.jsp"); }%>
 
        
    <!DOCTYPE html>
    <html lang="en">
    <head>
        
        <link rel="stylesheet" href="style3.css">
        
        
    </head>
    
    <body >
        <header><div class="overlay">
            <h1>Gamers Zone</h1>
        </div>
</header>
<nav >
    <form action="home"><input type="submit" id="n1" value="Home"></form>
    <form action="Enroll.html"><input type="submit" id="n2" value="Enroll"></form>
    <form action=""><input type="submit" id="n3" value="Search"></form>
    <form action=""><input type="submit" id="n4" value="Friends"></form>
    <form action="Profile.jsp"><input type="submit" id="n5" value="Profile"></form>
    <form action="validate"><input type="submit" id="n7" name="action" value="Logout"></form>
    
</nav>
        <main id="enroll">
            <div>
               <div id = "en1div"> <a id="en1" href="new.html">New Enrollment</a> </div>
               
               <div id = "en2div"><a id="en2" href="editenroll.jsp">Edit Existing Enrollment</a> </div>
               
                <div id = "en3div"><a id="en3" href="delete.html">Delete Enrollment</a> </div>
            </div>
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

    