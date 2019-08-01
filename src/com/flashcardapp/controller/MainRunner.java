package com.flashcardapp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainRunner {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.close();
		entityManagerFactory.close();

	}

}
