package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "scales")
public class Scale {
	
	private String _id;
	private String email;	
	private String q1;
	
	private int[] questions = new int[15];
	
	
	
	public Scale() {
		System.out.print("aaaaaaaa");
		System.out.print("bbbbbbbb");
	}
	
	public String get_id() {
		return _id;
	}
	
	public void set_id(String id) {
		this._id = id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int[] getQuestions() {
		return questions;
	}
	
	public void setQuestions() {
		for(int i = 0; i < questions.length; i++) {
			this.questions[i] = questions[i];
		}
	}
	
	public String getQ1() {
		return q1;
	}
	
	public void setQ1(String q1) {
		this.q1 = q1;
	}

}
