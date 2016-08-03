package org.academiadecodigo.SpringLogin.service;

import org.academiadecodigo.SpringLogin.user.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by codecadet on 19/07/16.
 */
public class MockUserService implements UserService {

    private List<User> list = new ArrayList<>();

    public MockUserService(List<User> list) {
        this.list = list;
    }

    @Override
    public User findAll() {

        Iterator<User> users = list.iterator();

        while (users.hasNext()) {

            User user = users.next();

                return user;

            }return null;
        }


    @Override
    public boolean authenticate(String name, String pass) {

        User user = findByName(name);

        if(user!=null){

            if (user.getPass().equals(pass)){

                return true;
            }

        } return false;

    }

    @Override
    public void addUser(User user) {

        if (findByName(user.getName())==null){

            list.add(user);

        }

    }

    @Override
    public void removeUser(String name) {

        Iterator<User> users = list.iterator();

        User user = users.next();

        if (user.getName().equals(name)) {

            users.remove();
        }
    }


    @Override
    public User findByName(String name) {

        Iterator<User> users = list.iterator();

        while (users.hasNext()) {

            User user = users.next();

            if (user.getName().equals(name)) {

                return user;
            }
        }return null;
    }
    @Override
    public int count () {
        return list.size();
    }
}
