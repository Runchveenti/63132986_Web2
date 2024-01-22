package nguyenngocanhthu;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class BMIServlet
 */
public class BMIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BMIServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("<title>BMI Calculator</title>");
        out.println("<style>");
        out.println("body {font-family: 'Arial', sans-serif; background-color: #f5f5f5;}");
        out.println(".container {width: 50%; margin: auto; padding: 20px; background-color: #fff; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);}");
        out.println("h1, p {text-align: center; color: #333;}");
        out.println("form {text-align: center;}");
        out.println("label { font-weight: bold; display: block; margin-bottom: 5px; color: #007bff;}");
        out.println("input {width: 100%; padding: 8px; margin-bottom: 10px; box-sizing: border-box; border: 1px solid #ccc; border-radius: 4px;}");
        
        // Set nút Submit 
        out.println("input[type='submit'] {background-color: #007bff; color: #fff; cursor: pointer;}");
        out.println("input[type='submit']:hover {background-color: #0056b3;}");
        
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"container\">");
        out.println("<h1>BMI Calculator</h1>");
        
        // Tạo form nhập vào các chỉ số 
        out.println("<form action=\"BMI\" method=\"post\">");
        out.println("<label for=\"height\">Height (cm):</label>");
        out.println("<input type=\"text\" id=\"height\" name=\"height\" required>");
        out.println("<br>");
        out.println("<label for=\"weight\">Weight (kg):</label>");
        out.println("<input type=\"text\" id=\"weight\" name=\"weight\" required>");
        out.println("<br>");
        out.println("<input type=\"submit\" value=\"Calculate BMI\">");
        out.println("</form>");
        
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String weightBmi = request.getParameter("weight");
		String heightBmi = request.getParameter("height");
		
		//Chuyển sang kiểu số 
		try {
			double weight = Double.parseDouble(weightBmi);
			double height = Double.parseDouble(heightBmi);
			
			//Tính BMI 
			double BMI = weight / ((height/100) * (height/100));
			
			//Xác định mức độ sau khi tính toán
			String BMICategory = "";
			if(BMI < 18.5) {
				BMICategory = "Underweight";
			}
			else if(BMI < 25) {
				BMICategory = "Normal weight";
			}
			else if(BMI < 30) {
				BMICategory = "Overweight";
			}
			else {
				BMICategory = "Obese";
			}
			
			//In ra kết quả 
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<title>BMI Result</title>");
            out.println("<style>");
            out.println("body {font-family: 'Arial', sans-serif; background-color: #f5f5f5;}");
            out.println(".container {width: 50%; margin: auto; padding: 20px; background-color: #fff; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);}");
            out.println("h1, p {text-align: center; color: #333;}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"container\">");
            out.println("<h1>BMI Result</h1>");
            out.println("<p>Your BMI: " + String.format("%.2f", BMI) + "</p>");
            out.println("<p>Category: " + BMICategory + "</p>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
			
		} catch(NumberFormatException ex) {
			//Xử lý lỗi nếu người dùng nhập vào không phải là số 
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<title>Error</title>");
            out.println("<style>");
            out.println("body {font-family: 'Arial', sans-serif; background-color: #f5f5f5;}");
            out.println(".container {width: 50%; margin: auto; padding: 20px; background-color: #fff; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);}");
            out.println("h1, p {text-align: center; color: #333;}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"container\">");
            out.println("<h1>Error</h1>");
            out.println("<p>Please enter valid height and weight.</p>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
		}
	}

}
