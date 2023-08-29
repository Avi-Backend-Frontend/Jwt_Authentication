package com.example.demo.model;

public class JwtResponce {
	
	private String token;

	public JwtResponce() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JwtResponce(String token) {
		super();
		this.token = token;
	}

	@Override
	public String toString() {
		return "JwtResponce [token=" + token + "]";
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	

}
