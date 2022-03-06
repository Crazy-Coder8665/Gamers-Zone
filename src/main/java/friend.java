

import java.io.IOException;
import java.io.PrintWriter;

import projectpkg.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.*;

/**
 * Servlet implementation class friend
 */
@WebServlet("/friend")
public class friend extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public friend() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
		HttpSession s=request.getSession(false);
		String id=(String) s.getAttribute("id");
		String fid=request.getParameter("friend");
		
		if(id.equals(fid)) {
			s.setAttribute("e","Cannot send request to yourself");
			response.sendRedirect("search.jsp");
			return;
			}
		PersonDAO pd = new PersonDAO();
		friendinfo fi=new friendinfo(id,fid,1,0,0);
		Boolean flag = pd.savefriend(fi);
		friendinfo fi1=new friendinfo(fid,id,0,1,0);
		Boolean flag1 = pd.savefriend(fi1);
		if(flag == true && flag1 == true) {
			s.setAttribute("e","request sent");
			response.sendRedirect("search.jsp");
			out.close();
			
		}
		else {
			s.setAttribute("e","request already sent");
			response.sendRedirect("search.jsp");
			out.close();
			
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
