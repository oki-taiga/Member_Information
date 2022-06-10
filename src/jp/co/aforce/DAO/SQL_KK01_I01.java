package jp.co.aforce.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jp.co.aforce.bean.Member;

public class SQL_KK01_I01 extends DAO {
	Member m=new Member();
	public int insert(Member m)throws Exception{

		LocalDateTime date=LocalDateTime.now();
		DateTimeFormatter d=DateTimeFormatter.ofPattern("yyMMddHHmmss");
		String new_member_id="A"+d.format(date);

		Connection con=getConnection();
		PreparedStatement st=con.prepareStatement("insert into MEMBER_INFO values(?,?,?,?,?,?,?,?,?,?)");
		st.setString(1, new_member_id);
		st.setString(2, m.getLast_Name());
		st.setString(3, m.getFirst_Name());
		st.setInt(4, m.getSex());
		st.setInt(5, m.getBirth_Year());
		st.setInt(6, m.getBirth_Month());
		st.setInt(7, m.getBirth_Day());
		st.setString(8, m.getJob());
		st.setInt(9, m.getPhone_Number());
		st.setString(10, m.getMail_Address());

		int line=st.executeUpdate();

		st.close();
		con.close();
		return line;
	}

}