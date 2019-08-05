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

	@Parameterized.Parameters
	public static Collection params() {
		return Arrays
				.asList(new Object[][] { { new Flashcarduser("hluckham0@google.ru", "Hazel Luckham", "X1uZcoIh0dj") },
						{ new Flashcarduser("sbowden1@yellowbook.com", "Sonnnie Bowden", "SJc4aWSU") },
						{ new Flashcarduser("qllorens2@howstuffworks.com", "Quillan Llorens", "W6rJuxd") },
						{ new Flashcarduser("cstartin3@flickr.com", "Clem Startin", "XYHzJ1S") },
						{ new Flashcarduser("tattwool4@biglobe.ne.jp", "Thornie Attwool", "Hjt0SoVmuBz") },
						{ new Flashcarduser("hguerre5@deviantart.com", "Harcourt Guerre", "OzcxzD1PGs") },
						{ new Flashcarduser("htaffley6@columbia.edu", "Holmes Taffley", "xowtOQ") },
						{ new Flashcarduser("aiannitti7@is.gd", "Alexandra Iannitti", "TWP4hf5j") },
						{ new Flashcarduser("ljiroudek8@sitemeter.com", "Laryssa Jiroudek", "bXRoLUP") },
						{ new Flashcarduser("cjaulme9@bing.com", "Cahra Jaulme", "FnVklVgC6r6") },
						{ new Flashcarduser("abc", "Karma Tsering", "abc") },
						{ new Flashcarduser("liennbphan@gmail.com", "lien phan", "1234") } });
	}

	@Test
	public void testValidateUser() {
		UserServices uServices = new UserServices();
		Flashcarduser actualuser = uServices.validateUser(expecteduser.getEmail(), expecteduser.getPassword());

		assertEquals(expecteduser, actualuser);
	}

}
