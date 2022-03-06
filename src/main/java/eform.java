import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.sql.*;
import java.util.*;
@WebServlet("/eform")
public class eform extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	//storage
	response.setContentType("text/html");
    PrintWriter out = response.getWriter();



    //result

    
 request.getRequestDispatcher("/header.html").include(request,response);

    out.println(" <main><div id=\"formdiv\"><form name=\"user\" action=\"enroll\" method=\"post\"><p id=\"main\" >Enroll</p><p>Enter Gamer ID: <input id=\"ID\" type=\"text\" name=\"id\" placeholder=\"Example:retro123\"  required readonly value = \""+"talha"+"\"> </p><p>Enter Opponent ID: <input id=\"ID\" type=\"text\" name=\"opid\" placeholder=\"Example:retro123\"  readonly required value = \""+"Masood"+"\"> <div id=\"err1\"></div> </p><p>Select Date of Challenge:<select name=\"Day\" ><option value=\"1\">1</option><option value=\"2\">2</option><option value=\"3\">3</option><option value=\"4\">4</option><option value=\"5\">5</option><option value=\"6\">6</option><option value=\"7\">7</option><option value=\"8\">8</option><option value=\"9\">9</option><option value=\"10\">10</option><option value=\"11\">11</option><option value=\"12\">12</option><option value=\"13\">13</option><option value=\"14\">14</option><option value=\"15\">15</option><option value=\"16\">16</option><option value=\"17\">17</option><option value=\"18\">18</option><option value=\"19\">19</option><option value=\"20\">20</option><option value=\"21\">21</option><option value=\"22\">22</option><option value=\"23\">23</option><option value=\"24\">24</option><option value=\"25\">25</option><option value=\"26\">26</option><option value=\"27\">27</option><option value=\"28\">28</option><option value=\"29\">29</option><option value=\"30\">30</option><option value=\"31\">31</option></select><select name=\"Month\" ><option value=\"1\">JAN</option><option value=\"2\">FEB</option><option value=\"3\">MAR</option><option value=\"4\">April</option><option value=\"5\">May</option><option value=\"6\">June</option><option value=\"7\">July</option><option value=\"8\">AUG</option><option value=\"9\">SEPT</option><option value=\"10\">OCT</option><option value=\"11\">NOV</option><option value=\"12\">DEC</option></select><select name=\"Year\" ><option value=\"2022\">2022</option></select></p><p>Select Game :<select name=\"Game\" ><option value=\"Fortntie\">Fortnite</option><option value=\"PUBG PC\">PUBG PC</option><option value=\"COD MW\">COD MW</option></select></p><p><input type=\"submit\" value=\"Enroll\" onclick=\"return validate()\"> </p></form></div></main> ");

    request.getRequestDispatcher("/footer.html").include(request,response);
    out.close(); 
    return;
        
	
	}


}