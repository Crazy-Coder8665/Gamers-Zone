<%@ page import="projectpkg.*" errorPage="Enroll.jsp"%>
<%
		PersonDAO pd = new PersonDAO();
		Enrollinfo pi = new Enrollinfo();
		String id = (String) request.getSession(false).getAttribute("id");
		pi=pd.geten(id);
		
		%>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style2.css">
        <link rel="stylesheet" href="style3.css">
        <title>New Enrollment</title>
       
    </head>
    <body>
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
    <form action="validate"><input type="submit" name="action" id="n7" value="Logout"></form>
    
</nav>
        <main>
        <div id="formdiv">
            <form name="user" action="validate" method="post">
              <p id="main" >Enroll</p>
              <p>Enter Gamer ID: <input id="ID" type="text" name="id" value="<%=pi.getId()%>" readonly> <div id="err1"></div> </p>
              <p>Enter Opponent ID: <input id="ID" type="text" name="opid" value="<%=pi.getOpid()%>"  readonly> <div id="err1"></div> </p>
              <p>Select Date of Challenge:
                <select name="Day" >
                  <option value="1">1</option>
                  <option value="2">2</option>
                  <option value="3">3</option>
                  <option value="4">4</option>
                  <option value="5">5</option>
                  <option value="6">6</option>
                  <option value="7">7</option>
                  <option value="8">8</option>
                  <option value="9">9</option>
                  <option value="10">10</option>
                  <option value="11">11</option>
                  <option value="12">12</option>
                  <option value="13">13</option>
                  <option value="14">14</option>
                  <option value="15">15</option>
                  <option value="16">16</option>
                  <option value="17">17</option>
                  <option value="18">18</option>
                  <option value="19">19</option>
                  <option value="20">20</option>
                  <option value="21">21</option>
                  <option value="22">22</option>
                  <option value="23">23</option>
                  <option value="24">24</option>
                  <option value="25">25</option>
                  <option value="26">26</option>
                  <option value="27">27</option>
                  <option value="28">28</option>
                  <option value="29">29</option>
                  <option value="30">30</option>
                  <option value="31">31</option>
                </select>
                <select name="Month" >
                  <option value="1">JAN</option>
                  <option value="2">FEB</option>
                  <option value="3">MAR</option>
                  <option value="4">April</option>
                  <option value="5">May</option>
                  <option value="6">June</option>
                  <option value="7">July</option>
                  <option value="8">AUG</option>
                  <option value="9">SEPT</option>
                  <option value="10">OCT</option>
                  <option value="11">NOV</option>
                  <option value="12">DEC</option>
                </select>
                <select name="Year" >
                  <option value="2022">2022</option>
                </select>
            </p>
              <p>Select Game :<select name="Game" >
                  <option value="Fortntie">Fortnite</option>
                  <option value="PUBG PC">PUBG PC</option>
                  <option value="COD MW">COD MW</option>
              </select></p>
              

              <p><input type="submit" name="action" value="edit" onclick="return validate()"> </p>
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