
import projectpkg.*;
import java.util.*;
import java.io.IOException;

import java.io.PrintWriter;

import projectpkg.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class validate
 */
@WebServlet("/validate")
public class validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    
		if((request.getParameter("action")).equals("Login")) {
			PersonDAO pd =new PersonDAO(); 
			 
			 try {
				 if(request.getParameter("email")==null || request.getParameter("password")==null){   	 
					 request.setAttribute("id","false");
						request.getRequestDispatcher("/Login.jsp").forward(request,response);
				    }
				 String id= pd.Login(request.getParameter("email"),request.getParameter("password"));
				 
				if(pd.Login(request.getParameter("email"),request.getParameter("password")).equals("null")){   	 
					 request.setAttribute("id","false");
						request.getRequestDispatcher("/Login.jsp").forward(request,response);
				    }
						else {
							
							HttpSession ss=request.getSession(true);
				 			ss.setAttribute("email",request.getParameter("email"));
							ss.setAttribute("id",id);
				        	request.getRequestDispatcher("/home").forward(request,response);
						}
				 			
			} catch (Exception e) {
				e.printStackTrace();
			}
			 			
			 			
			
		}
		else if((request.getParameter("action")).equals("SignUp")) {
			String ID = request.getParameter("id");
		    String fname = request.getParameter("fname");
		    String lname = request.getParameter("lname");
		    String email = request.getParameter("email");
		    String password = request.getParameter("password");

		         PersonDAO pd = new PersonDAO();
		             try {
						if(pd.newrecord(fname, lname, email, password, ID) == false){
							 request.setAttribute("id","false");
						    request.getRequestDispatcher("/SignUp.jsp").forward(request,response);
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		             request.setAttribute("id","true");
		        request.getRequestDispatcher("/Login.jsp").forward(request,response);       
		        
		}
		else if((request.getParameter("action")).equals("Delete Profile")) {
			PersonDAO pd = new PersonDAO();
			String email = (String) request.getSession(false).getAttribute("email");
			try {
				pd.delete(email);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			request.getSession(false).invalidate();
			response.sendRedirect("index.jsp");
			
		}
		else if((request.getParameter("action")).equals("Logout")) {
			 request.getSession(false).invalidate();
				response.sendRedirect("Login.jsp");
		}
		else if((request.getParameter("action")).equals("edit")) {
			Enrollinfo er=new Enrollinfo(request.getParameter("id"),request.getParameter("opid"),request.getParameter("Day"),request.getParameter("Year"),request.getParameter("Month"),request.getParameter("Game"));
			PersonDAO pd=new PersonDAO();
			try {
				pd.edit(er);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("Enroll.jsp");
			
		}
		else if((request.getParameter("action")).equals("Search")) {
			PersonDAO pd=new PersonDAO();
			ArrayList<Personinfo> al=new ArrayList<>();
			try {
				al=pd.search(request.getParameter("key"));
				
				request.getSession(false).setAttribute("search", al);
				request.getRequestDispatcher("search.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
