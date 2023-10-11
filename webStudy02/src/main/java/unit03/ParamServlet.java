package unit03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		String id = request.getParameter("id");
		int age = Integer.parseInt(request.getParameter("age"));
		
		PrintWriter out = response.getWriter();
		out.println("당신의 id 는" + id + "<br>");
		out.println("당신의 나이는" + age + "<br>");
		out.close();
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		//doGet(request, response); get에 넘겨서 같은 결과
		String id = request.getParameter("id");
		int age = Integer.parseInt(request.getParameter("age"));
		
		PrintWriter out = response.getWriter();
		out.println("당신의 id 는" + id + "<br>");
		out.println("당신의 나이는" + age + "<br>");
		out.close();
		
	}

}
