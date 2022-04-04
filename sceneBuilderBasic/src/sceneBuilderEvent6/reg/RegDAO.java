package sceneBuilderEvent6.reg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import sceneBuilderEvent6.login.LoginDAO;

public class RegDAO extends LoginDAO{

	public void insert(RegDTO reg) {
		//INSERT INTO fx_concept VALUES('관리자', 'admin', '1234', '남', '30대', '스포츠 영화');
		String sql = "INSERT INTO fx_concept VALUES(?,?,?,?,?,?)";
		Connection con = getCon();
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, reg.getName());
			ps.setString(2, reg.getId());
			ps.setString(3, reg.getPw());
			ps.setString(4, reg.getGender());
			ps.setString(5, reg.getAge());
			ps.setString(6, reg.getHobbys());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}