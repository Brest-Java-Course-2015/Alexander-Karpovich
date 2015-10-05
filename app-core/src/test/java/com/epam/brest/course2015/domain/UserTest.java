package com.epam.brest.course2015.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ntrln on 05.10.15.
 */
public class UserTest {
	private User user;

	@Before
	public void setUp() throws Exception{
		user=new User();
	}

	@Test
	public void testGetLogin() throws Exception {
		user.setLogin("LOGIN");
		assertEquals("LOGIN",user.getLogin());
	}
}