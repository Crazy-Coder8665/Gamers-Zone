<%@ page session="false" errorPage="Login.jsp" import="projectpkg.*,java.util.*"  %>


    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style2.css">
        <link rel="stylesheet" href="style3.css">
        <title>Edit</title>
        
    </head>
    <body>
        <header><div class="overlay">
            <h1>Gamers Zone</h1>
        </div>
</header>
<nav >
    <form action="home"><input type="submit" id="n1" value="Home"></form>
    <form action="Enroll.html"><input type="submit" id="n2" value="Enroll"></form>
    <form action="search.jsp"><input type="submit" id="n3" value="Search"></form>
    <form action=""><input type="submit" id="n4" value="Friends"></form>
    <form action="Profile.jsp"><input type="submit" id="n5" value="Profile"></form>
    <form action="validate"><input type="submit" id="n7" name="action" value="Logout"></form>
    
</nav>
<main>
    <div id="formdiv">
 <form  action="validate" method="post">
    <p>Gamer ID: <input name="key" type="text" placeholder="Enter Gamer ID" ><span style="color:red"><%if(request.getSession(false).getAttribute("e")!=null){ %><%=request.getSession(false).getAttribute("e")%><%} %> </span></textarea>
        <p><input type="submit" name="action" value="Search" ></p>
 </form>
		<% 	HttpSession s = request.getSession(false);
			Personinfo pi;
			ArrayList<Personinfo> al=(ArrayList<Personinfo>)s.getAttribute("search");
			if( s.getAttribute("search") != null){
			for(int i=0;i< al.size();i++){
			pi=al.get(i);%>
			<div style=" color: blue;font-size: 40px;font-weight: bold;">
			<form action="friend" ><%= pi.ID %> <button type="submit" name="friend" value="<%= pi.ID %>">Friend</button></form>
			</div>
			<%}s.setAttribute("search", null);s.setAttribute("e", null);} %>
		
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