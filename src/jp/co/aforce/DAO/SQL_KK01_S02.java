package jp.co.aforce.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jp.co.aforce.bean.Member;

public class SQL_KK01_S02 extends DAO{
	Member m=new Member();
	public Member search
	(String last_name,String first_name,int sex,int birth_year,int birth_month,int birth_day,String job,int phone_number,String mail_address)
			throws Exception{
		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement("SELECT * FROM MEMBER_INFO WHERE MEMBER_ID=?");

				return m;

	}


}
