import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;
import com.oracle.jrockit.jfr.RequestDelegate;

/**
 * Servlet implementation class BeerServelet
 */
@WebServlet("/SelectBeer.do")
public class BeerServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeerServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String c = request.getParameter("color") ;
	    String d = request.getParameter("body") ;
	    String[] sizes = request.getParameterValues("sizes") ;
	    
	    
	    BeerExpert be = new BeerExpert () ;
	    List <String> result = be.getBrands(c) ;
	    List <String> result2 = be.getBrands(d) ;
	    
//	    response.setContentType("text/html");
//	    PrintWriter out = response.getWriter() ;	    
//	    out.println("Beer selection Advice <br>");
	    
	    request.setAttribute("styles", result );
	    request.setAttribute("styles2", result2 );
	    request.setAttribute("sizes", sizes);
	    
	    RequestDispatcher view = request.getRequestDispatcher("result.jsp") ;	    
	    view.forward(request, response);
	    
	}
}
