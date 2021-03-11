package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; //primary key
	
	@Column(name="username", unique=true, nullable=false)
	private String username; //unique
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="email", nullable=false) //in future versions this may be made unique -- but for now its fine
	private String email;
	
	//private Role role; // this is for possible future expansion (adding admin roles)
	//there should probably be a field (foreign key to join table) here that refers to the chatroom the users are part of

	public User() {this(0, "", "", "");}
	public User(int id, String username, String password, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public User(String username, String password, String email) {
		this(0, username, password, email);
	}
}
