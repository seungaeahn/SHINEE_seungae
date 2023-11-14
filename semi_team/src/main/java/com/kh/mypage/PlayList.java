package com.kh.mypage;

import java.sql.Date;

public class PlayList {
	private String playlist_id;
	private String user_id;
	private String playlist_name;
	private Date create_date;
	private String playlist_image;
	
	

	public PlayList(String playlist_id, String user_id, String playlist_name, String playlist_image) {
		this.playlist_id = playlist_id;
		this.user_id = user_id;
		this.playlist_name = playlist_name;
		this.playlist_image = playlist_image;
		
	}
	
	public String getPlaylist_image() {
		return playlist_image;
	}

	public void setPlaylist_image(String playlist_image) {
		this.playlist_image = playlist_image;
	}
	
	public String getPlaylist_id() {
		return playlist_id;
	}
	public void setPlaylist_id(String playlist_id) {
		this.playlist_id = playlist_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPlaylist_name() {
		return playlist_name;
	}
	public void setPlaylist_name(String playlist_name) {
		this.playlist_name = playlist_name;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	
    
 
}
