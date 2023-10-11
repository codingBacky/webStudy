package unit06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		String job = request.getParameter("job");
		String interest = request.getParameter("interest");
		
		PrintWriter out = response.getWriter();
		out.println("당신이 선택한 직업은 " + job + "<br>");
		out.println("관심분야는 " + interest + "<br>");
		out.println("<a href='javascript:history.go(-1)'>다시 선택할게요</a>");
		out.close();
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
