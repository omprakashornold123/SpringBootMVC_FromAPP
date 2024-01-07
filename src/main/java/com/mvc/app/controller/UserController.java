package com.mvc.app.controller;

import com.mvc.app.binding.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {


    @GetMapping("/")
    public String loadForm(HttpServletRequest request ){
        return "index";
    }

    @PostMapping("user")
    public String handleSubmitBtn(User user, Model model){
        System.out.println("User "+user);
        model.addAttribute( "msg" ,"User is Saved") ;
        return "index";
    }
}
