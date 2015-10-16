package com.epam.brest.course2015.service;

import com.epam.brest.course2015.domain.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public User getUserById(Integer userId);

    public User getUserByLogin(String login);

    public Integer addUser(User user);

    public void updateUser(User user);

    public void deleteUser(Integer userId);

}