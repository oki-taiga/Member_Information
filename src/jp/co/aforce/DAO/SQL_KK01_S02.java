package jp.co.aforce.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.bean.Member;

public class SQL_KK01_S02 extends DAO{
	Member m=new Member();
	public Member search
	(String member_id)
			throws Exception{
		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement("SELECT * FROM MEMBER_INFO WHERE MEMBER_ID=?");
		st.setString(1,member_id);
		ResultSet rs=st.executeQuery();

		while(rs.next()) {
			m.setMember_Id("member_id");
		}
		st.close();
		con.close();
				return m;

	}


}
