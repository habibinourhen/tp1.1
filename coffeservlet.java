package isetj.servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servelet implementation class coffeservlet
 */
@WebServlet("/coffeservlet")
public class coffeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public coffeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String selection = request.getParameter("selection");
		String txtarea = request.getParameter("txtarea");

		response.setContentType("text/html");
		response.getWriter().println("<html><head><title>Coffee</title></head>");
		response.getWriter().println("<body> <img src=\"2.jpg\" height=\"250px\" width=\"250px\">");
		response.getWriter().println("<br>");
		response.getWriter().println("<p>Merci de nous avoir fait parvenir la remarque suivante concernant <strong>" + selection +"</strong>  </p>");
		response.getWriter().println("<p>"+ txtarea + "</p>");
		response.getWriter().println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}