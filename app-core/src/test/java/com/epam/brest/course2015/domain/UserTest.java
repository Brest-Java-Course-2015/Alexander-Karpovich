package com.epam.brest.course2015.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

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
	@Test
	public void testGetPassword() throws Exception{
		user.setPassword("pass");
		assertEquals("pass",user.getPassword());
	}
	@Test
	public void testGetUserId()throws Exception{
		user.setUserId(12);
		assertEquals((Integer)12,user.getUserId());
	}

	@Test
	public void testCreatedDate()throws Exception{
		user.setCreatedDate(new Date(2015,2,3));
		assertEquals(new Date(2015,2,3),user.getCreatedDate());
	}
}