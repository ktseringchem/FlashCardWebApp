///**
// * 
// */
//package com.flashcardapp.service;
//
//import static org.junit.Assert.*;
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
//	FlashCards expected;
//
//	public CardServicesTest(FlashCards expected) {
//		super();
//		this.expected = expected;
//	}
//
//	@Parameterized.Parameters
// 	public static Collection params() 
//	{
// 		return Arrays.asList(new Object[][]{ 			
// 			{new FlashCards(6, "ACID", "The acronym for the four properties guaranteed by transactions: atomicity, consistency, isolation, and durability.", "2019-07-26 11:34:12.0", Users [email=htaffley6@columbia.edu, cname=Holmes Taffley, password=xowtOQ])},
// 			{new FlashCards(7, "actual parameter list", "The arguments specified in a particular method call. See also                  formal parameter list .", "2019-07-26 11:34:12.0", Users [email=qllorens2@howstuffworks.com, cname=Quillan Llorens, password=W6rJuxd])},
// 			{new FlashCards(8, "API", "Application Programming Interface. The specification of how a programmer writing an application accesses the behavior and state of classes and objects.", "2019-07-26 11:34:12.0", Users [email=sbowden1@yellowbook.com, cname=Sonnnie Bowden, password=SJc4aWSU])},
// 			{new FlashCards(9, "applet", "A component that typically executes in a Web browser, but can execute in a variety of other applications or devices that support the applet programming model.", "2019-07-26 11:34:13.0", Users [email=sbowden1@yellowbook.com, cname=Sonnnie Bowden, password=SJc4aWSU])},
// 			{new FlashCards(10, "argument", "A data item specified in a method call. An argument can be a literal value, a variable, or an expression.", "2019-07-26 11:34:13.0", Users [email=hluckham0@google.ru, cname=Hazel Luckham, password=X1uZcoIh0dj])},
// 			{new FlashCards(11, "array", "A collection of data items, all of the same type, in which each item's position is uniquely designated by an integer.", "2019-07-26 11:34:13.0", Users [email=ljiroudek8@sitemeter.com, cname=Laryssa Jiroudek, password=bXRoLUP])},
// 			{new FlashCards(12, "ASCII", "American Standard Code for Information Interchange. A standard assignment of 7-bit numeric codes to characters. See also                  Unicode .", "2019-07-26 11:34:13.0", Users [email=ljiroudek8@sitemeter.com, cname=Laryssa Jiroudek, password=bXRoLUP])},
// 			{new FlashCards(13, "atomic", "Refers to an operation that is never interrupted or left in an incomplete state under any circumstance.", "2019-07-26 11:34:13.0", Users [email=hluckham0@google.ru, cname=Hazel Luckham, password=X1uZcoIh0dj])},
// 			{new FlashCards(14, "authentication", "The process by which an entity proves to another entity that it is acting on behalf of a specific identity.", "2019-07-26 11:34:13.0", Users [email=hguerre5@deviantart.com, cname=Harcourt Guerre, password=OzcxzD1PGs])},
// 			{new FlashCards(15, "authorization", "See                 access control.", "2019-07-26 11:34:13.0", Users [email=qllorens2@howstuffworks.com, cname=Quillan Llorens, password=W6rJuxd])},
// 			{new FlashCards(16, "autoboxing", "Automatic conversion between                  reference  and                  primitive  types.", "2019-07-26 11:34:13.0", Users [email=hluckham0@google.ru, cname=Hazel Luckham, password=X1uZcoIh0dj])}
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
//		List<FlashCards> expecteds = (List<FlashCards>) expected;
//		List<FlashCards> actuals = cser.getAllFlashCard();
//		
//		assertEquals(expecteds, actuals);
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
