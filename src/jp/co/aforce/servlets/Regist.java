package jp.co.aforce.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.DAO.SQL_KK01_I01;
import jp.co.aforce.DAO.SQL_KK01_S01;
import jp.co.aforce.bean.Member;

@WebServlet(urlPatterns= {"/jp.co.aforce/regist"})
public class Regist extends HttpServlet {
	private static String warning;
	private static final Object W_CCM0001="{"+warning+"}は必須入力です。";
	private static final Object E_WKK0001 ="会員情報が既に登録されています。";
	private static final Object E_WKK0002 ="会員情報の登録に失敗しました。";
	private static final Object I_WKK0001 ="会員情報の登録が完了しました。";

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();

		if(request.getParameter("back") !=null) {
			request.getRequestDispatcher("/views/home.jsp").forward(request, response);
		}


		String last_name=request.getParameter("last_name");
		String first_name=request.getParameter("first_name");
		String job=request.getParameter("job");
		String mail_address=request.getParameter("mail_address");
		int sex=Integer.parseInt(request.getParameter("sex"));
		int birth_year=Integer.parseInt(request.getParameter("birth_year"));
		int birth_month=Integer.parseInt(request.getParameter("birth_month"));
		int birth_day=Integer.parseInt(request.getParameter("birth_day"));
		int phone_number=Integer.parseInt(request.getParameter("phone_number"));

		Member m=new Member();

		m.setLast_Name(last_name);
		m.setFirst_Name(first_name);
		m.setSex(sex);
		m.setBirth_Year(birth_year);
		m.setBirth_Month(birth_month);
		m.setBirth_Day(birth_day);
		m.setJob(job);
		m.setPhone_Number(phone_number);
		m.setMail_Address(mail_address);

		SQL_KK01_S01 S01=new SQL_KK01_S01();
		SQL_KK01_I01 I01=new SQL_KK01_I01();


		try {
			int count=S01.search(last_name, first_name, sex, birth_year, birth_month, birth_day, job, phone_number, mail_address);
			if(count>=1 ) {
				request.setAttribute("error", E_WKK0001);
				request.getRequestDispatcher("../views/regist.jsp").forward(request, response);
			}else {
				 int line=I01.insert(m);
				if(line>0) {
					//request.setAttribute("info", I_WKK0001);
					out.println(I_WKK0001);

				}else {
					//request.setAttribute("error", E_WKK0002);
					out.println(E_WKK0002);
				}
			}

		}catch(Exception e) {
			request.getRequestDispatcher("../views/home.jsp").forward(request, response);
			}
		}
}
