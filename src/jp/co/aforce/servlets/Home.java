package jp.co.aforce.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/jp.co.aforce/home"})
public class Home extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{

	if(request.getParameter("members_regist") !=null) {
		request.getRequestDispatcher("/views/regist.jsp").forward(request, response);
	}
	if(request.getParameter("members_update") !=null) {
		request.getRequestDispatcher("/views/update.jsp").forward(request, response);
	}
	if(request.getParameter("members_delete") !=null) {
		request.getRequestDispatcher("/views/delete.jsp").forward(request, response);
	}

	}
}