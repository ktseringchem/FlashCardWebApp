package com.flashcardapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.flashcardapp.validator.EmailConstraint;

@Entity
@Table
@NamedQueries({ @NamedQuery(query = "SELECT fcU FROM Flashcarduser fcU", name = "getAllCardUser"),
		@NamedQuery(query = "SELECT cfUser FROM Flashcarduser cfUser WHERE cfUser.email = :email", name = "getFlashCardUserByEmail") })

public class Flashcarduser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;

	@Column
//	@EmailConstraint
	private String email;

	@Size(min = 2, max = 20, message = "First name length must be between {2} and {1}")
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

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Flashcarduser other = (Flashcarduser) obj;
		
		return user_id == other.user_id &&
				email.equals(other.email) &&
				cname.equals(other.cname) &&
				password.equals(other.password);
	}
}
