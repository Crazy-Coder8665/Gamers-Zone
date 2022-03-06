import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.sql.*;
import java.util.*;
@WebServlet("/edit")
public class edit extends HttpServlet {

    
    
public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
        	//storage
	response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    


    String id = request.getParameter("id");
    

    //Seletion
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://127.0.0.1/users";
    Connection con=DriverManager.getConnection(url,"root","root");
    Statement st=con.createStatement();


	

     String query="select* from enroll ";

    
     ResultSet rs = st.executeQuery( query );
     while(rs.next()){
         if(id.equals(rs.getString("id"))){
            
                
            request.getRequestDispatcher("/eform").forward(request,response);
            
           

    return ;}
          
         
         }
         
         request.getRequestDispatcher("/edit.html").include(request,response);
         
         out.println("<script>document.alert(\"Record not Found\")</script>");
         out.close();
        
          
     }
    
    catch(Exception e){
        System.out.println(e);

    }

    //result

   

	
	}


}