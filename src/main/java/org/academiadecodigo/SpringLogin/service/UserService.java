package org.academiadecodigo.SpringLogin.service;

import org.academiadecodigo.SpringLogin.user.User;

/**
 * Created by codecadet on 20/07/16.
 */
public interface UserService {

    public boolean authenticate(String name, String pass);

    public User findByName(String name);

    public void addUser(User user);

    public void removeUser(String name);

    public User findAll();

    public int count();
}