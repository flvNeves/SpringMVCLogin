package org.academiadecodigo.SpringLogin.user;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
/**
 * Created by codecadet on 20/07/16.
 */
public class User {


    @NotNull(message = "Username is mandatory!")
    @NotBlank(message = "Username is mandatory!")
    @Pattern(regexp = "[a-z-A-Z]*", message = "Username has invalid chars!")
    private String name;

    @NotNull
    @NotBlank
    @Size(min=3,max=12, message = "Size 3-12 chars")
    private String pass;

    @Email
    private String mail;

    public User(){

    }

    public User(String name, String pass){
        this.name = name;
        this.pass =pass;
    }

    public User(String name, String mail, String pass){
        this.name=name;
        this.mail=mail;
        this.pass=pass;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
