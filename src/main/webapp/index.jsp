<%@ page session="false" %>
<% if(request.getSession(false) != null){
	response.sendRedirect("home");
}%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header><div class="overlay">
                <h1>Gamers Zone</h1>
            </div>
    </header>
    <nav>
        <a href="index.jsp">Home</a>
        <a href="Login.jsp">Login</a>
        <a href="SignUp.jsp">Signup</a>
    </nav>    
  
    <main>
        <section>
            <img src="" alt="">
            <img src="" alt="">
            <img src="" alt="">
        </section>
        <section>
            <h2>Enroll Now</h2>
            <p></p>
           
        </section>
        <section>
            <h2>Gamers Zone </h2>
            <img src="reaper.jpg" alt="Reapers" width="50%">
            <h3>Fear the Reapers</h3>
            <a href="https://www.youtube.com/c/ReapersStreaming/about" target="_blank">Youtube</a>&puncsp;&puncsp;
            <a href="https://www.instagram.com/reaperstreaming" target="_blank">Instagram</a>&puncsp;&puncsp;
            <a href="https://www.facebook.com/Reapers_streaming" target="_blank">Facebook</a>
        </section>


    </main>
    <footer>
        <a href="#">FAQ</a>
        <a href="#">Contact Us</a>
        <a href="#">Terms of Use</a>
        <a href="#">Privacy Policy</a>
        <a href="#">Refund Policy</a>
        <a href="#">&copy; 2021 | Reapers Streaming</a>
    </footer>
</body>
</html>