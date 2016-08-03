package org.academiadecodigo.SpringLogin.controller;


import org.academiadecodigo.SpringLogin.Authenticator;
import org.academiadecodigo.SpringLogin.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.logging.Logger;


/**
 * Created by codecadet on 19/07/16.
 */
@Controller
@SessionAttributes("loginUser")
public class LoginController {

    private static Logger log = Logger.getLogger(LoginController.class.getName());

    @Autowired
    private Authenticator authenticator;


    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public ModelAndView showLogin() {

        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("loggedUser", new User());
        return modelAndView;

    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String doLogin(Model model, @Valid @ModelAttribute("loggedUser") User user, BindingResult bindingResult) {

        if(bindingResult.hasErrors()){
            return "login";
        }

        // If user/pass fields are empty, display the same view again
        if (user.getName() == null || user.getPass().isEmpty() || user.getPass() == null || user.getName().isEmpty()) {
            return "login";
        }

        // If auth succeeds, render a new view
        if (authenticator.authenticate(user.getName(), user.getPass())) {
            model.addAttribute("greeting", "Welcome");
            return "main";

        // If auth fails, render the same view with error message
      } else {
            model.addAttribute("error", "Authentication Failure");
            return "login";
        }

    }


}