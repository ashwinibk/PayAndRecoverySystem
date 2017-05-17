package com.PayAndRecovery.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User {
   
	@Id
	private String id;
	
  public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}

	private String name, role, contact, email, password  ; 
	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	public String getContact() {
		return contact;
	}

	
	public void setContact(String contact) {
		this.contact = contact;
	}

	
	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name +
				",  contact=" + contact +
				",email=" + email +
				", password=" + password + "]";
		
	}
}
