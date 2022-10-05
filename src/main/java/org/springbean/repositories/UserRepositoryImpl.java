package org.springbean.repositories;

import org.springbean.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    @Override
    public List<User> findAll(){
        List<User> list = new ArrayList<User>();

        User user1 = new User("Saikiran","M.");
        User user2 = new User("Bhavya","Ch.");

        list.add(user1);
        list.add(user2);

        return list;
    }
}
