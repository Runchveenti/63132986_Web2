package nguyenngocanhthu;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class VDdoGet
 */
public class VDdoGet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public VDdoGet() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String value1 = request.getParameter("param1");
		String value2 = request.getParameter("param2");
		PrintWriter traVe = response.getWriter();
		traVe.append("Gia tri tham so param1 = ");
		traVe.append(value1);
		traVe.append("\nGia tri tham so param2 = ");
		traVe.append(value2);
	}
	
}
