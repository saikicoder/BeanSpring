package org.springbean.services;

import org.springbean.models.User;
import org.springbean.repositories.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserRepository repository;

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }
}
