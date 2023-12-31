package com.kh.mypage;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayListDAO {
	private static final String jdbcURL = "jdbc:oracle:thin:@localhost:1521";
	private static final String jdbcUsername = "shinee";
	private static final String jdbcPassword = "shinee";
	
	public PlayListDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Connection con = null;
	
	public List<PlayList> getAllPlayLists(String user_id) {
		List<PlayList> playlists = new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			String sql = "SELECT playlist_id, user_id, playlist_name, playlist_image FROM playlist_info_2 WHERE user_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			ResultSet resultSet = ps.executeQuery();
			
			while (resultSet.next()) {
	            
				String playlistId = resultSet.getString("playlist_id");
	            String userId = resultSet.getString("user_id");
	            String playlistName = resultSet.getString("playlist_name");
	           
	            
	            Blob blob = resultSet.getBlob("playlist_image");
                byte[] imageData = blob.getBytes(1, (int) blob.length());
                String imageBase64 = java.util.Base64.getEncoder().encodeToString(imageData);
                String playlist_image = "data:image/jpeg;base64, " + imageBase64;
				
	           
				PlayList playlist = new PlayList(playlistId, userId, playlistName, playlist_image);
				playlists.add(playlist);
				
	       

	        }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return playlists;
	}
}
