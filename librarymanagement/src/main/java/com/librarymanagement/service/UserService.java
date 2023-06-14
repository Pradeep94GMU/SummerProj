package com.librarymanagement.service;

import java.util.List;

import com.librarymanagement.model.User;

public interface UserService {
	List<User> getAllUsers();
    User getUserById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);

}
