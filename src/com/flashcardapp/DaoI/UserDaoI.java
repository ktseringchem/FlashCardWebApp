package com.flashcardapp.DaoI;

import com.flashcardapp.entities.Flashcarduser;

public interface UserDaoI {

	void removeCardUser(int user_id);

	Flashcarduser getFlashCardUserByEmail(String email);

	
}