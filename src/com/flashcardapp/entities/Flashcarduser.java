package com.flashcardapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
@NamedQuery (query="SELECT cfUser FROM Flashcarduser cfUser WHERE cfUser.email = :email", name="getFlashCardUserByEmail")
public class Flashcarduser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_id;
	private String email;
	private String cname;
	private String password;
	
	
	public Flashcarduser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flashcarduser(String email, String cname, String password) {
		super();
		this.email = email;
		this.cname = cname;
		this.password = password;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Users [email=" + email + ", cname=" + cname + ", password=" + password + "]";
	}
}
