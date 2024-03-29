package com.mimoza.furnimoza.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String anonce; 
    private String full_text;
    private int views;
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAnonce() {
		return anonce;
	}
	public void setAnonce(String anonce) {
		this.anonce = anonce;
	}
	public String getFull_text() {
		return full_text;
	}
	public void setFull_text(String full_text) {
		this.full_text = full_text;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Post(String title, String anonce, String full_text) {
		
		this.title = title;
		this.anonce = anonce;
		this.full_text = full_text;
	}
	public Post() {
		
	}
	
	}