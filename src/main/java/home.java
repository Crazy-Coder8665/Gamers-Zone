import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/home")
public class home extends HttpServlet {

    
    
public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
        	//storage
	response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    HttpSession s = request.getSession(false);
    
    if(s == null){
        request.getRequestDispatcher("/Login.jsp").forward(request,response);
    }


    request.getRequestDispatcher("/header.html").include(request,response);
            request.getRequestDispatcher("/home.html").include(request,response);
            request.getRequestDispatcher("/footer.html").include(request,response);
            out.close();

    //result

   

	
	}
public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
{        

    	//storage
response.setContentType("text/html");
PrintWriter out = response.getWriter();
HttpSession s = request.getSession(false);

if(s == null){
    request.getRequestDispatcher("/Login.jsp").forward(request,response);
}


request.getRequestDispatcher("/header.html").include(request,response);
        request.getRequestDispatcher("/home.html").include(request,response);
        request.getRequestDispatcher("/footer.html").include(request,response);
        out.close();

//result




}


}