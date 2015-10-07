package com.epam.brest.course2015.dao;

import com.epam.brest.course2015.domain.User;

import java.util.List;

public interface UserDao {
	public List<User> getAllUsers();

	public User getUserById(Integer id);
}
