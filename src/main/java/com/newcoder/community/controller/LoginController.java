package com.newcoder.community.controller;

import com.newcoder.community.entity.User;
import com.newcoder.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/register",method = RequestMethod.GET)
    public String getRegisterPage(){
        return "/site/register";
    }

    @RequestMapping(path = "/register",method = RequestMethod.POST)
    public String register(Model model, User user){
        Map<String,Object> map = userService.register(user);
        if (map==null || map.isEmpty()){
            model.addAttribute("msg","注册成功，您将收到一封邮件，请尽快激活");
            model.addAttribute("target","/index");
            return "/site/operate-result";
        }else {
            model.addAttribute("usernameMsg",map.get("usernameMsg"));
            model.addAttribute("passwordMsg",map.get("passwordMsg"));
            model.addAttribute("emailMsg",map.get("emailMsg"));
            return "/site/register";
        }



    }
}
