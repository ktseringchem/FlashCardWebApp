package com.flashcardapp.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table
@NamedQueries({
@NamedQuery (query="SELECT fc FROM FlashCards fc", name="getAllFlashCard"),
@NamedQuery (query="DELETE FROM FlashCards WHERE flashcard_id = :fc_id", name="removeFlashCardbyId")
})
public class FlashCards {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flashcard_id;
	
	@Column(length=60)
	private String front;
	
	@Column(length=600)
	private String back;
	@Column
	private Timestamp timestamp;
	@JoinColumn(name="User_id")
	@ManyToOne
	private Flashcarduser flashcarduser;
	
	
	public FlashCards() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FlashCards(String front, String back) {
		super();
		this.front = front;
		this.back = back;
	}
		
	public FlashCards(String front, String back, Timestamp timestamp, Flashcarduser flashcarduser) {
		super();
		this.front = front;
		this.back = back;
		this.timestamp = timestamp;
		this.flashcarduser = flashcarduser;
	}
	
	public int getFlashcard_id() {
		return flashcard_id;
	}
	public void setFlashcard_id(int flashcard_id) {
		this.flashcard_id = flashcard_id;
	}
	public String getFront() {
		return front;
	}
	public void setFront(String front) {
		this.front = front;
	}
	public String getBack() {
		return back;
	}
	public void setBack(String back) {
		this.back = back;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public Flashcarduser getFlashcarduser() {
		return flashcarduser;
	}
	public void setFlashcarduser(Flashcarduser flashcarduser) {
		this.flashcarduser = flashcarduser;
	}
	@Override
	public String toString() {
		return "FlashCards [flashcard_id=" + flashcard_id + ", front=" + front + ", back=" + back + ", timestamp="
				+ timestamp + ", Flashcarduser=" + flashcarduser + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((back == null) ? 0 : back.hashCode());
		result = prime * result + flashcard_id;
		result = prime * result + ((front == null) ? 0 : front.hashCode());
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
		FlashCards other = (FlashCards) obj;
		if (back == null) {
			if (other.back != null)
				return false;
		} else if (!back.equals(other.back))
			return false;
		if (flashcard_id != other.flashcard_id)
			return false;
		if (front == null) {
			if (other.front != null)
				return false;
		} else if (!front.equals(other.front))
			return false;
		return true;
	}

	
}
