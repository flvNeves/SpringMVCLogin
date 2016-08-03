package org.academiadecodigo.SpringLogin.controller;


import org.academiadecodigo.SpringLogin.service.UserService;
import org.academiadecodigo.SpringLogin.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by codecadet on 21/07/16.
 */
@Controller
@SessionAttributes("loginUser")
public class UserController {

       UserService userService;


        @RequestMapping(method = RequestMethod.GET, value = "/users")
        public String listUsers(Model model) {
            model.addAttribute("findUsers", userService.findAll());
            return "main";
        }

        @RequestMapping (method = RequestMethod.GET,value = "user/remove/{name}")
        public String removeUser(Model model, @PathVariable("name") String name){
            userService.removeUser(name);
            return "main";

        }


        @RequestMapping(method = RequestMethod.POST, value = "/user/add")
        public String addUser(Model model, @ModelAttribute User user, RedirectAttributes redirectAttributes) {
            userService.addUser(user);
            redirectAttributes.addFlashAttribute("message",user.getName() + "Was added");

            // Instead of returning a rendered view to the browser,
            // a 302 redirect is sent to /users, forcing listUsers() to execute after adding a new user
            return "redirect:/main";

        }

}
