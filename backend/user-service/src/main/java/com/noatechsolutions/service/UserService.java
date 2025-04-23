package com.noatechsolutions.service;

import com.noatechsolutions.exception.UserException;
import com.noatechsolutions.modal.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id) throws UserException;
    List<User> getAllUsers();
    void deleteUser(Long id) throws UserException;
    User updateUser(Long id,User user) throws UserException;

}
