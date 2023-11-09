package com.kh.mypage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MyPageDAO {
	private static final String jdbcURL = "jdbc:oracle:thin:@localhost:1521";
	private static final String jdbcUsername = "shinee";
	private static final String jdbcPassword = "shinee";
	
	public MyPageDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Connection con = null;
	
	public UserInfo getMember(String user_id) {
		UserInfo ui = null;
		try {
			con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			String sql = "SELECT * FROM USER_INFO WHERE user_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			ResultSet resultSet = ps.executeQuery();
			
			if (resultSet.next()) {
	            
				String userId = resultSet.getString("user_id");
	            String userName = resultSet.getString("user_name");
	            String userNickname = resultSet.getString("user_nickname");
				String userPassword = resultSet.getString("user_password");
				String email = resultSet.getString("email");
				String phoneNumber = resultSet.getString("phone_number");
				
				
				ui = new UserInfo(userId, userName, userNickname, userPassword, email, phoneNumber);

	        }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ui;
	}
	
	
}
