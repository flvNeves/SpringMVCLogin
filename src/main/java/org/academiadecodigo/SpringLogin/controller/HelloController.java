package org.academiadecodigo.SpringLogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by codecadet on 20/07/16.
 */
// Let Spring find the controller
@Controller
public class HelloController {

    // Map the URL/Verb to the method
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String sayHello(Model model) {

        // Add an attribute to the request
        model.addAttribute("greeting", "Hello World");

        // Return the view name
        return "hello";

    }

}