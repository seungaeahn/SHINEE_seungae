package com.kh.mypage;

public class FollowList {
	private String follower_id;
	private String following_id;
	

	public FollowList(String follower_id,String following_id) {
		this.follower_id = follower_id;
		this.following_id = following_id;
	}


	public String getFollower_id() { 
		return follower_id;
	}


	public void setFollower_id(String follower_id) {
		this.follower_id = follower_id;
	}


	public String getFollowing_id() {
		return following_id;
	}


	public void setFollowing_id(String following_id) {
		this.following_id = following_id;
	}
	
	
}
