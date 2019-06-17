package com.github.shivanikanojia.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("cassandrausers")
public class Users {
	@PrimaryKey
	private Long id;
	private String username;
	private String password;
	private String email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}
	public String getEmail() {
		return email;
	}
}
