package com.sysco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by james.zhu on 2018/12/17.
 */
@RefreshScope
@Controller
public class TestController {
    @Autowired
    private Environment environment;


    @RequestMapping(value = "/from", method = RequestMethod.GET)
    @ResponseBody
    public String from(){
        String property = environment.getProperty("from", "undefined");
        return property;
    }
}
