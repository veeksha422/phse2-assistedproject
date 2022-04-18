package advanced.java.program;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class HttpSessionDashboard
 */
public class HttpSessionDashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpSessionDashboard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        
        HttpSession session=request.getSession(false);  
        String userId = null;
        if (session.getAttribute("userid") != null)
            userId =(String)session.getAttribute("userid");  
        if (userId == null ) {
            out.println("No UserId was found in session.<br>");
        } else {
            out.println("UserId obtained from session :" + userId + "<br>");
        }
        out.println("</body></html>");

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
