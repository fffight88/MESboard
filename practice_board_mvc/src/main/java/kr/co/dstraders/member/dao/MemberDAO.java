package kr.co.dstraders.member.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.dstraders.member.vo.MemberVO;

public class MemberDAO {

	/**
	 * 1. 로그인 기능
	 */
	
	public MemberVO login(MemberVO member) {
		
		MemberVO currentUser = new MemberVO();
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		StringBuilder sql = new StringBuilder();
		sql.append(" select id, password, name, type from t_member where id=? and password=? ");
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				currentUser.setId(rs.getString("id"));
				currentUser.setPassword(rs.getString("password"));
				currentUser.setName(rs.getString("name"));
				currentUser.setType(rs.getString("type"));
			}

			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return currentUser;
	}
	
	/**
	 *  2. 회원 가입 기능
	 */
	
	public Boolean join(MemberVO member) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			StringBuilder sql = new StringBuilder();
			sql.append(" INSERT INTO t_member (id, password, name, type) ");
			sql.append(" values (?, ?, ?, 'U') " );
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());

			pstmt.executeUpdate();
			
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception

			return false;
			
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
