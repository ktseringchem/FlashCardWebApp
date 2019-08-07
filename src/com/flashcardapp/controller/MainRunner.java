package com.flashcardapp.controller;

import java.util.List;

import com.flashcardapp.service.CardServices;

public class MainRunner {

	public static void main(String[] args) {
		CardServices cser = new CardServices();
		List<String> fc_list = cser.fiveRandomCard();
		System.out.println(fc_list);
	}

}