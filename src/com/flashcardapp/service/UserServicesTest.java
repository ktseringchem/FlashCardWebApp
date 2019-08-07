package com.flashcardapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.flashcardapp.entities.Flashcarduser;

@RunWith(Parameterized.class)
public class UserServicesTest {
	private Flashcarduser expecteduser;


	public UserServicesTest(Flashcarduser expecteduser) {
		super();
		this.expecteduser = expecteduser;
	}
	
//	@Test
//	public void testregisterCardUser() 
//	{
//		Flashcarduser expected = new Flashcarduser("qwerty", "qwerty", "qwerty");
//		
//		UserServices uServices = new UserServices();
//		uServices.registerCardUser("qwerty", "qwerty", "qwerty");
//		Flashcarduser actual = uServices.getFlashCardUserByEmail(expected.getEmail());
//
//		assertEquals(expected, actual);
//	}
//	
//	@Test
//	public void testremoveCardUser() 
//	{
//		UserServices uServices = new UserServices();
//		Flashcarduser foundUser = uServices.getFlashCardUserByEmail("qwerty");
//		uServices.removeCardUser(foundUser.getUser_id());
//		Flashcarduser actual = uServices.getFlashCardUserByEmail(foundUser.getEmail());
//
//		assertEquals(null, actual);
//	}

	@Parameterized.Parameters
	public static Collection params() {
		return Arrays
				.asList(new Object[][] {
					{new Flashcarduser(1, "hluckham0@google.ru", "Hazel Luckham", "X1uZcoIh0dj")},
					{new Flashcarduser(2, "sbowden1@yellowbook.com", "Sonnnie Bowden", "SJc4aWSU")},
					{new Flashcarduser(3, "qllorens2@howstuffworks.com", "Quillan Llorens", "W6rJuxd")},
					{new Flashcarduser(4, "cstartin3@flickr.com", "Clem Startin", "XYHzJ1S")},
					{new Flashcarduser(5, "tattwool4@biglobe.ne.jp", "Thornie Attwool", "Hjt0SoVmuBz")},
					{new Flashcarduser(6, "hguerre5@deviantart.com", "Harcourt Guerre", "OzcxzD1PGs")},
					{new Flashcarduser(7, "htaffley6@columbia.edu", "Holmes Taffley", "xowtOQ")},
					{new Flashcarduser(8, "aiannitti7@is.gd", "Alexandra Iannitti", "TWP4hf5j")},
					{new Flashcarduser(9, "ljiroudek8@sitemeter.com", "Laryssa Jiroudek", "bXRoLUP")},
					{new Flashcarduser(10, "cjaulme9@bing.com", "Cahra Jaulme", "FnVklVgC6r6")},
					{new Flashcarduser(11, "abc", "Karma Tsering", "abc")},
					{new Flashcarduser(12, "a", "sam g", "a")}
					});
	}

	@Test
	public void testValidateUser() 
	{
		UserServices uServices = new UserServices();
		Flashcarduser actualuser = uServices.validateUser(expecteduser.getEmail(), expecteduser.getPassword());

		assertEquals(expecteduser, actualuser);
	}

}
