package nguyenngocanhthu;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AboutMeServlet
 */
public class AboutMeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AboutMeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Đọc thông tin cá nhân từ tham số
		String name = request.getParameter("name");
		String school = request.getParameter("school");
		String major = request.getParameter("major");
		String className = request.getParameter("class");
		String email = request.getParameter("email");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Tạo HTML response
		out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("<title>About Me</title>");
        out.println("<style>");
        
        // Giao diện CSS
        out.println("body {font-family: Arial, sans-serif; background-color: #f5f5f5;}");
        out.println(".container {width: 40%; margin: auto; padding: 20px; background-color: #925145; border-radius: 10px; box-shadow: 0 0 15px rgba(0, 0, 0, 0.5);}");
        out.println("h1, p {text-align: center; color: white;}");
        out.println(".info {margin-bottom: 10px;display: flex;}");
        out.println(".info label { font-weight: bold; font-size: 15px; margin-bottom: 5px; margin-top: 10px; margin-left: 30px; color: #231a16; display: block;}");
        out.println(".info p {margin-top: 10px; color: white; margin-left: 5px;}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        
        // Set thông tin vào HTML
        out.println("<div class=\"container\">");
        out.println("<h1>About Me</h1>");
        
        // Hiển thị thông tin
        out.println("<div class=\"info\"><label>Name:</label><p>" + name + "</p></div>");
        out.println("<div class=\"info\"><label>School:</label><p>" + school + "</p></div>");
        out.println("<div class=\"info\"><label>Major:</label><p>" + major + "</p></div>");
        out.println("<div class=\"info\"><label>Class:</label><p>" + className + "</p></div>");
        out.println("<div class=\"info\"><label>Email:</label><p>" + email + "</p></div>");
        
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        
	}
}
