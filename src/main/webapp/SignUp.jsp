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
        <title>Sign Up</title>
        <script>
            function validate(){
                flag = 0
                if(document.user.fname.value == ""||document.user.lname.value == ""){
                    document.getElementById("err1").textContent = "Name field is empty"
                    flag++
                    
                }else{
                    document.getElementById("err1").textContent = ""
                }
                x = document.user.email.value;
                a = new Array();
                a =x.split('@');    
                if(x == ""){
            
                    document.getElementById("err2").textContent = "email field is empty"
                    flag++
                }else if(  a[0]== ""||a[1].indexOf('@')>= 0|| !(a[1].indexOf('.')>0)||a[1]== "")
                {
                    document.getElementById("err2").textContent = "email is not valid"
                    flag++
                }
                else{
                    document.getElementById("err2").textContent = ""
                }
                    y = document.user.password.value;
                if(document.user.password.value == ""  ){
                    document.getElementById("err3").textContent = "Password field is empty"
                    flag++
                }else if(y.length < 8){
                    document.getElementById("err3").textContent = "Password too short"
                    flag++
                }else{
                    document.getElementById("err3").textContent = ""
                }
                if(document.user.conpassword.value != document.user.password.value   ){
                    document.getElementById("err4").textContent = "Password does not match"
                   flag++
                }else{
                    document.getElementById("err4").textContent = ""
                }
                if (flag>0){
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
              <p id="main" >Sign up</p>
              <p style="color:red">
					<% if(request.getAttribute("id")=="false"){ 
                out.println("ID or Email Already exists");
				}%>
				
              <p>Enter Gamer ID: <input id="ID" type="text" name="id" placeholder="Example:retro123" onblur="validate()"> <div id="err1"></div> </p>
              <p>First Name: <input type="text" name="fname" placeholder="first Name" onblur="validate()"> Last Name:<input type="text" name="lname" placeholder="Last Name" onblur="validate()"><div id="err1"></div> </p>
              <p>Email: <input type="email" name="email" placeholder="abc@domian.com"onblur="validate()"><div id="err2" ></div> </p>
              <p> Password: <input type="password" name="password" placeholder="Password"onblur="validate()"><div id="err3"></div> </p>
              <p> Confirm Password: <input type="password" name="conpassword" placeholder="Confirm Password"onblur="validate()"><div id="err4"></div> </p>
             
            
            <p>By Clicking "Submit" you accept <a href="#">Terms</a>and <a href="#">Conditions</a> </p>
              <p><input type="submit" name="action" value="SignUp" onclick="return validate()"> </p>
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