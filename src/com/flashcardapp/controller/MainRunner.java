package com.flashcardapp.controller;

import java.util.List;

import com.flashcardapp.entities.FlashCards;
import com.flashcardapp.entities.Flashcarduser;
import com.flashcardapp.service.CardServices;
import com.flashcardapp.service.UserServices;

public class MainRunner {

	public static void main(String[] args) {
		CardServices cser = new CardServices();
		List<FlashCards> fc_list = (List<FlashCards>) cser.getAllFlashCard();
		UserServices uSer = new UserServices();
		List<Flashcarduser> fcU = uSer.getAllCardUser();
		for (Flashcarduser user : fcU) {
			System.out.println("INSERT INTO customer(\"cemail\", \"cname\", \"cpass\") value(\""
		+ user.getEmail()+ "\", \""+user.getCname()+ "\", \"" + user.getPassword()+ "\");" );
		}

	}

}
