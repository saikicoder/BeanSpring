package org.springbean.services;

import org.springbean.models.User;
import org.springbean.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{

    //use of the @Autowired annotation, we could get rid of our Setter/Constructor injections.
    @Autowired
    private UserRepository repository;

    //use of the @Autowired annotation, we could get rid of our Setter/Constructor injections.
    // called for setter injection as well
    public UserServiceImpl() {
        System.out.println("UserService Default Constructor called");
    }

    //used by Constructor injection only
    public UserServiceImpl(UserRepository repository) {
        System.out.println("UserService Constructor called");
        this.repository = repository;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    //use of the @Autowired annotation on literals, we could get rid of our Setter/Constructor injections.
    //used by Setter injection and Autowired if used on this method
    //@Autowired
    public void setRepository(UserRepository repository) {
        System.out.println("UserService Setter called");this.repository = repository;
    }
}
