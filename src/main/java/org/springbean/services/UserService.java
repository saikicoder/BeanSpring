package org.springbean.services;

import org.springbean.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
