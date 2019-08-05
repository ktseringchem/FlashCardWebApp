package com.flashcardapp.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.flashcardapp.DaoI.UserDaoI;
import com.flashcardapp.entities.Flashcarduser;

public class UserServices implements UserDaoI {

	public Flashcarduser validateUser(String email, String passwd) 
	{
		Flashcarduser result = null;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try
		{
			Query query = entityManager.createNamedQuery("getFlashCardUserByEmail");
			query.setParameter("email", email);
			Flashcarduser foundUser = (Flashcarduser) query.getSingleResult();
			
			if(foundUser != null && passwd.equals(foundUser.getPassword()))
			{
				result = foundUser;
			}
			else
			{
				result = null;
			}
			
		}
		catch (Exception e) 
		{
			e.getMessage();
		}
		finally
		{
			entityManager.close();
			entityManagerFactory.close();
		}
		
		return result;
	}
	
	public void registerCardUser(String email, String cName, String password)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try
		{
			Flashcarduser foundUser = validateUser(email, password);
			
			if(foundUser == null)
			{
				Flashcarduser fcuser = new Flashcarduser(email, cName, password);
				entityManager.getTransaction().begin();
				entityManager.persist(fcuser);
				entityManager.getTransaction().commit();
			}
			
		}
		catch (Exception e) 
		{
			e.getMessage();
		}
		finally
		{
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}
	
	public List<Flashcarduser> getAllCardUser()
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try
		{
			Query query = entityManager.createNamedQuery("getAllCardUser");
			List<Flashcarduser> fc_list = query.getResultList();
			return fc_list;
			
		}
		catch (Exception e) 
		{
			e.getMessage();
		}
		finally
		{
			entityManager.close();
			entityManagerFactory.close();
		}
		return null;
	}
	
	@Override
	public void removeCardUser(int user_id)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try
		{
			entityManager.getTransaction().begin();
			Query query = entityManager.createNamedQuery("removeFlashCardUserbyId");
			query.setParameter("user_id", user_id);
			query.executeUpdate();
			entityManager.getTransaction().commit();	
		}
		catch (Exception e) 
		{
			e.getMessage();
		}
		finally
		{
			entityManager.close();
			entityManagerFactory.close();
		}
	}
	
	@Override
	public Flashcarduser getFlashCardUserByEmail(String email)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try
		{
			Query query = entityManager.createNamedQuery("getFlashCardUserByEmail");
			query.setParameter("email", email);
			Flashcarduser foundUser = (Flashcarduser) query.getSingleResult();
			return foundUser;
		}
		catch (Exception e) 
		{
			e.getMessage();
			return null;
		}
		finally
		{
			entityManager.close();
			entityManagerFactory.close();
		}
	}

}
