package com.sysco.controller;

import com.sysco.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import response.GenericResponse;

@Controller
public class LogController {
    @Autowired
    private LogService logService;

    @ResponseBody
    @RequestMapping(value = "/select-log-list", method = RequestMethod.GET)
    public GenericResponse selectLogList(){
        System.out.println("dasdasds");
        GenericResponse genericResponse = logService.selectLogList();
        return genericResponse;
    }
}
