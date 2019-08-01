package com.flashcardapp.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.flashcardapp.entities.FlashCards;

public class CardServices {
	
	public boolean addFlashCard(String front, String back)
	{
		boolean result = false;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		FlashCards flashcard = new FlashCards(front, back);
		try
		{
			entityManager.getTransaction().begin();
			entityManager.persist(flashcard);
			entityManager.getTransaction().commit();
			result = true;
			
		}
		catch (Exception e) 
		{
			e.getMessage();
			result = false;
		}
		finally
		{
			entityManager.close();
			entityManagerFactory.close();
		}
		return result;
	}
	
	public List<FlashCards> getAllFlashCard()
	{
		List<FlashCards> result = new ArrayList<FlashCards>();
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try
		{
			Query query = entityManager.createNamedQuery("getAllFlashCard");
//			query.setParameter("user_id", user_id);
			result = query.getResultList();  
		}
		catch (Exception e) 
		{
			result = null;
			System.out.println(result);
		}
		finally
		{
			entityManager.close();
			entityManagerFactory.close();
		}
		return result;
	}
	

	public void removeFlashCard(int flashcard_id) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try
		{
			entityManager.getTransaction().begin();
			Query query = entityManager.createNamedQuery("removeFlashCardbyId");
			query.setParameter("fc_id", flashcard_id);
			query.executeUpdate();
			entityManager.getTransaction().commit();
		}
		catch (Exception e) 
		{
			
		}
		finally
		{
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}
	
	public static <T> List<T> castList(Class<? extends T> clazz, Collection<?> c) 
	{
	    List<T> r = new ArrayList<T>(c.size());
	    for(Object o: c)
	      r.add(clazz.cast(o));
	    return r;
	}

	public void updateFlashCard(String front, String back, String id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		int fc_id = Integer.parseInt(id);
		try
		{
			FlashCards fc = entityManager.find(FlashCards.class, fc_id);
			System.out.println(fc.getFlashcard_id());
			entityManager.getTransaction().begin();
			fc.setFront(front);
			fc.setBack(back);
			entityManager.getTransaction().commit();
		}
		catch (Exception e) 
		{
			
		}
		finally
		{
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}

}
