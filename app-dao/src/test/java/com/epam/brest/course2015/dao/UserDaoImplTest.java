package com.epam.brest.course2015.dao;

import com.epam.brest.course2015.domain.User;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ntrln on 07.10.15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:test-spring-dao.xml"})
public class UserDaoImplTest {
	@Autowired
	private UserDao userDao;

	@org.junit.Test
	public void testGetAllUsers() throws Exception {
		List<User> users = userDao.getAllUsers();
		assertTrue(users!=null);
	}

	@org.junit.Test
	public void testGetUserById() throws Exception {
		User user=userDao.getUserById(1);
		assertTrue(user.getUserId()==1);
	}
}