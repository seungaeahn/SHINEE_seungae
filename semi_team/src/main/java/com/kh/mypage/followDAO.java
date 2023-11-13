package com.kh.mypage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class followDAO {
	private static final String jdbcURL = "jdbc:oracle:thin:@localhost:1521";
	private static final String jdbcUsername = "shinee";
	private static final String jdbcPassword = "shinee";
	
	public followDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Connection con = null;
	
	public List<FollowList> getAllFollowings(String follower_id) {
		List<FollowList> followlists = new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			String sql = "SELECT * FROM FOLLOW_LIST WHERE follower_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, follower_id);
			ResultSet resultSet = ps.executeQuery();
			
			while (resultSet.next()) {
	            
				String followerId = resultSet.getString("follower_id");
	            String followingId = resultSet.getString("following_id");
	           
				
				
	            FollowList followlist = new FollowList(followerId, followingId);
	            followlists.add(followlist);

	        }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return followlists;
	}
}
