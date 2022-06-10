package jp.co.aforce.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.bean.Member;

public class SQL_KK01_S01 extends DAO {
	Member m=new Member();
	public int search
	(String last_name,String first_name,int sex,int birth_year,int birth_month,int birth_day,String job,int phone_number,String mail_address)
	throws Exception{
		Connection con=getConnection();
		int count=0;

		PreparedStatement st=con.prepareStatement
		("SELECT COUNT(*) FROM MEMBER_INFO WHERE LAST_NAME=? and FIRST_NAME=? and SEX=? and BIRTH_YEAR=? and BIRTH_MONTH=? and BIRTH_DAY=? and JOB=? and PHONE_NUMBER=? and MAIL_ADDRESS=?");
		st.setString(1,last_name);
		st.setString(2,first_name);
		st.setInt(3,sex);
		st.setInt(4,birth_year);
		st.setInt(5,birth_month);
		st.setInt(6,birth_day);
		st.setString(7,job);
		st.setInt(8,phone_number);
		st.setString(9,mail_address);
		ResultSet rs=st.executeQuery();

		while(rs.next()) {
			count=rs.getInt(1);
		}
		st.close();
		con.close();

		return count;
	}
}
