package jbr.springmvc.model;

import java.sql.Timestamp;

public class ResultHistory {
	private String username;
	private Timestamp time;
	private int score;
	private String topic;
	
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public String getTopic() {
		return topic;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getUsername() {
		return username;
	}
	
	public Timestamp getTime() {
		return time;
	}
	
	public int getScore() {
		return score;
	}

}
