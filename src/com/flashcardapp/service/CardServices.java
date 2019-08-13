package com.flashcardapp.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.flashcardapp.DaoI.CardDaoI;
import com.flashcardapp.DaoI.UserDaoI;
import com.flashcardapp.entities.FlashCards;

public class CardServices implements CardDaoI {

	public boolean addFlashCard(String front, String back, int id) {
		boolean result = false;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		FlashCards flashcard = new FlashCards(front, back);
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(flashcard);
			entityManager.getTransaction().commit();
			result = true;

		} catch (Exception e) {
			e.getMessage();
			result = false;
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return result;
	}

	public List<FlashCards> getAllFlashCard() {
		List<FlashCards> result = new ArrayList<FlashCards>();

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getAllFlashCard");
//			query.setParameter("user_id", user_id);
			result = query.getResultList();
		} catch (Exception e) {
			result = null;
			System.out.println(result);
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return result;
	}

	public void removeFlashCard(int flashcard_id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			Query query = entityManager.createNamedQuery("removeFlashCardbyId");
			query.setParameter("fc_id", flashcard_id);
			query.executeUpdate();
			entityManager.getTransaction().commit();
		} catch (Exception e) {

		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}

	}

	public void updateFlashCard(String front, String back, String id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		int fc_id = Integer.parseInt(id);
		try {
			FlashCards fc = entityManager.find(FlashCards.class, fc_id);

			entityManager.getTransaction().begin();
			fc.setFront(front);
			fc.setBack(back);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}

	}
	
	public FlashCards getFlashCardById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		try {
			FlashCards fc = entityManager.find(FlashCards.class, id);
			return fc;
		} catch (Exception e) {
			e.getMessage();
			return null;
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}

	}

	@Override
	public List<String> fiveRandomCard() {
		List<FlashCards> flashcardlist = getAllFlashCard();
		List<String> ans = new ArrayList<String>();
		Random rand = new Random();

		for (int j = 0; j < 4; j++) {
			FlashCards randFC = flashcardlist.get(rand.nextInt(flashcardlist.size()));

			ans.add(randFC.getBack());
		}

//		Collections.shuffle(ans);
		return ans;
	}

}
