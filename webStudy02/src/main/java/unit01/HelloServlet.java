package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void init() throws ServletException {
		System.out.println("init---------");//서버가 구동할때
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget,,,,,,,");
		response.setContentType("text/html; charset=utf-8");//html문서에 응답 -> utf - 8
		
		PrintWriter out = response.getWriter();
		
		out.println("hello");
		out.println("안녕");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	@Override
	public void destroy() {//서버가 종료될때 - 자료 업데이트 등
		System.out.println("destory,,,,,,,");
	}

}
