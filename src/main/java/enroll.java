import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.sql.*;
import java.util.*;
@WebServlet("/enroll")
public class enroll extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	//storage
	response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String id = request.getParameter("id");
    String opid = request.getParameter("opid");
    String Date = request.getParameter("Year")+"-"+request.getParameter("Month")+"-"+request.getParameter("Day");
    String game = request.getParameter("Game");

    //Insertion
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1/users";
        Connection con=DriverManager.getConnection(url,"root","root");
        Statement st=con.createStatement();
    
    
        
    
         String query="select* from enroll ";
    
        
         ResultSet rs = st.executeQuery( query );
         while(rs.next()){
             if(id.equals(rs.getString("ID"))){
               
        
                request.getRequestDispatcher("/enroll.html").include(request,response);
                out.println("<script>document.alert(\"One Enrollment at a time\")</script>");
                 out.close(); 
                
                    return ;}
            
             
             
             }
            query="insert into enroll(ID,OPID,Game,Date) values('"+id+"','"+opid+"','"+game+"','"+Date+"' )";

 
            int resultset = st.executeUpdate( query );
              
         }
        
        catch(Exception e){
            System.out.println(e);
    
        }
   
  
   

   request.getRequestDispatcher("/Enroll.jsp").include(request,response);
   out.println("<script>alert(\"Enroll Successful\")</script>");
    out.close(); 

	
	}


}