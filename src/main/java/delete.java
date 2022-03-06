import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.sql.*;
import java.util.*;

@WebServlet("/delete")
public class delete extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	//storage
	response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String id = request.getParameter("id");

    //Insertion
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1/users";
        Connection con=DriverManager.getConnection(url,"root","root");
        Statement st=con.createStatement();
    
    
        
    
         String query="delete from enroll where ID = '"+id+"'";
    
        
         int resultset = st.executeUpdate( query );
         if(resultset > 0) {

        	   request.getRequestDispatcher("/Enroll.jsp").include(request,response);
        	    }
        	    else {
        	    	request.getRequestDispatcher("/delete.html").include(request,response);
        	    }
        	    out.close(); 
    }
    catch(Exception e){
        System.out.println(e);
    }
   

	
	}



}