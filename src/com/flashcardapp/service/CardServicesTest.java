///**
// * 
// */
//package com.flashcardapp.service;
//
//import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import com.flashcardapp.entities.FlashCards;
//
//@RunWith(Parameterized.class)
//public class CardServicesTest {
//	List<FlashCards> expected;
//
//	public CardServicesTest(List<FlashCards> expected) 
//	{
//		super();
//		this.expected = expected;
//	}
//
//	@Parameterized.Parameters
// 	public static Collection params() 
//	{
// 		return Arrays.asList(new Object[][]{
// 			
// 		});
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.flashcardapp.service.CardServices#addFlashCard(java.lang.String, java.lang.String)}.
//	 */
//	@Test
//	public void testAddFlashCard() {
//
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.flashcardapp.service.CardServices#getAllFlashCard()}.
//	 */
//	@Test
//	public void testGetAllFlashCard() {
//		
//		CardServices cser = new CardServices();
//		
////		List<FlashCards> expecteds = (List<FlashCards>) expected;
//		List<FlashCards> actuals = cser.getAllFlashCard();
//		System.out.println(actuals);
//		assertEquals(expected., actuals);
//		
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.flashcardapp.service.CardServices#removeFlashCard(int)}.
//	 */
//	@Test
//	public void testRemoveFlashCard() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.flashcardapp.service.CardServices#castList(java.lang.Class, java.util.Collection)}.
//	 */
//	@Test
//	public void testCastList() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.flashcardapp.service.CardServices#updateFlashCard(java.lang.String, java.lang.String, java.lang.String)}.
//	 */
//	@Test
//	public void testUpdateFlashCard() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@After
//	public void tearDown() throws Exception {
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//}
