package org.springbean.repositories;

import org.springbean.models.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
}
