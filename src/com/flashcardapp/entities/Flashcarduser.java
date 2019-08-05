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
@NamedQueries({
	@NamedQuery(query = "SELECT fcU FROM Flashcarduser fcU", name = "getAllCardUser"),
	@NamedQuery(query = "DELETE FROM Flashcarduser fcU WHERE fcU.user_id = :user_id", name = "removeFlashCardUserbyId"),
	@NamedQuery(query = "SELECT cfUser FROM Flashcarduser cfUser WHERE cfUser.email = :email", name = "getFlashCardUserByEmail") 
	})

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
	
	public Flashcarduser(int user_id, String email, String cname, String password) {
		super();
		this.user_id = user_id;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cname == null) ? 0 : cname.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + user_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flashcarduser other = (Flashcarduser) obj;
		if (cname == null) {
			if (other.cname != null)
				return false;
		} else if (!cname.equals(other.cname))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}

}
