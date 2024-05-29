package com.example.demo;

public class Post {
	
	int userId;
	int id;
	String title;
	String Body;
	
	public Post() {
		
	}
	
    public Post(int userId, int id, String title, String Body){
    	super();
    	this.id = id;
    	this.userId = userId;
    	this.title = title;
    	this.Body = Body;	
    }
    
    public int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id = id;
    }
    
    public int getUserId() {
    	return userId;
    }
    public void setUserId(int userId) {
    	this.userId = userId;
    	
    }
    
    public String gettitle() {
    	return title;
    }
    public void settitle(String title) {
    	this.title = title;
    }
    
    public String getBody() {
    	return Body;
    }
    public void setBody(String Body) {
    	this.Body = Body;
    }
}