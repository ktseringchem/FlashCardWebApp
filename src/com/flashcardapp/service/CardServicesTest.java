/**
 * 
 */
package com.flashcardapp.service;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized;

public class CardServicesTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager em = entityManagerFactory.createEntityManager();
		CardServices cardServices = new CardServices();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}
	
	@RunWith(Parameterized.class)
	public class 
	
	

	/**
	 * Test method for {@link com.flashcardapp.service.CardServices#addFlashCard(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testAddFlashCard() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.flashcardapp.service.CardServices#getAllFlashCard()}.
	 */
	@Test
	public void testGetAllFlashCard() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.flashcardapp.service.CardServices#removeFlashCard(int)}.
	 */
	@Test
	public void testRemoveFlashCard() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.flashcardapp.service.CardServices#castList(java.lang.Class, java.util.Collection)}.
	 */
	@Test
	public void testCastList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.flashcardapp.service.CardServices#updateFlashCard(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUpdateFlashCard() {
		fail("Not yet implemented");
	}
	
	
	
	
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
