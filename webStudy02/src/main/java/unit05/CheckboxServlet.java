package unit05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckboxServlet
 */
@WebServlet("/CheckboxServlet")
public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		String[] items = request.getParameterValues("item");
		
		PrintWriter out = response.getWriter();
		if(items == null) {
			out.println("선택한 항목이 없습니다💢💢");
		}
		else {
			out.print("선택한 아이템: ");
			for(String s:items)
				out.print(s +" ");
		}
		
		out.println("<a href='javascript:history.go(-1)'>다시 선택</a>");
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String[] item = request.getParameterValues("item");

		PrintWriter out = response.getWriter();
		out.println("선택한 아이템: " + item);
		out.println("<a href='javascript:history.go(-1)'>다시 선택</a>");
		out.close();
		
	}

}
