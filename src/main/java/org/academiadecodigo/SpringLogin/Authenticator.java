package org.academiadecodigo.SpringLogin;


import org.academiadecodigo.SpringLogin.service.UserService;

/**
 * Created by codecadet on 19/07/16.
 */
public class Authenticator {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public boolean authenticate(String name, String pass) {

    return userService.authenticate(name,pass);

    }
}