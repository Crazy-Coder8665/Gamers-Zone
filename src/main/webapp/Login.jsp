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
        <link rel="stylesheet" href="style2.css">
        <title>Login</title>
        <script>
            function validate(){
                flag =0
                
                x = document.user.email.value;
                a = new Array();
                a =x.split('@');    
                if(x == ""){
            
                    document.getElementById("err2").textContent = "email field is empty"
                    flag=1;
                }else if( a[0]== ""||a[1].indexOf('@')>= 0|| !(a[1].indexOf('.')>0)||a[1]== "")
                {
                    document.getElementById("err2").textContent = "email is not valid"
                    flag=1;
                }
                else{
                    document.getElementById("err2").textContent = ""
                }
                    y = document.user.password.value;
                if(document.user.password.value == ""  ){
                    document.getElementById("err3").textContent = "Password field is empty"
                    flag=1;
                }else if(y.length < 8){
                    document.getElementById("err3").textContent = "Password too short"
                    flag=1;
                }else{
                    document.getElementById("err3").textContent = ""
                }
                if (flag==1){
                    return false;
                }
               

            }
        </script>
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
        <div id="formdiv">
            <form name="user" action="validate" method="post">
              <p id="main" >Login</p>
              <p style="color:red">
					<% if(request.getAttribute("id")=="false"){ 
                out.println("Email or Password is incorrect");
				}
					
				%>
                </p>
                <p style="color:blue"><%if(request.getAttribute("id")=="true"){ 
                out.println("SignUp success");
				}%></p>
              <p>Email: <input type="email" name="email" placeholder="abc@domian.com"onblur="validate()"><div id="err2" ></div> </p>
              <p> <a href="#"> I want to use my current Email</a> </p>
              <p> Password: <input type="password" name="password" placeholder="Password"onblur="validate()"><div id="err3"></div> </p>
              <p><input type="submit" name="action" value="Login" onclick="return validate()"> </p>
              
               




            </form>
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