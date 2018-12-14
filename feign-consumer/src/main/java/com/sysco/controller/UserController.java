package com.sysco.controller;

import com.sysco.request.User;
import com.sysco.service.LogService;
import com.sysco.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import response.GenericResponse;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public GenericResponse testMethod1(){
        System.out.println("dasdasds");
        GenericResponse genericResponse = userService.findUser("zhy", "meiguo");
        return genericResponse;
    }

    @ResponseBody
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public GenericResponse testMethod2(){
        System.out.println("dasdasds");
        User user = new User().setName("qll").setAddress("riben");
        GenericResponse genericResponse = userService.createUser(user);
        return genericResponse;
    }
}
