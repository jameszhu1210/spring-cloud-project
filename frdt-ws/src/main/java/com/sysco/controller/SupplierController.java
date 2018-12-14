package com.sysco.controller;

import com.sysco.request.User;
import com.sysco.response.GenericResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/frdt")
public class SupplierController {

    @RequestMapping(value = "/select-log-list", method = RequestMethod.GET)
    @ResponseBody
    public GenericResponse selectLogList(){
        GenericResponse genericResponse = new GenericResponse();
        genericResponse.setResult(true);
        genericResponse.setRows(Arrays.asList("1", "2", "3"));
        return genericResponse;
    }

    @RequestMapping(value = "/find-user", method = RequestMethod.GET)
    @ResponseBody
    public GenericResponse findUser(String name, String address){
        GenericResponse genericResponse = new GenericResponse();
        User user = new User().setName(name).setAddress(address);
        genericResponse.setResult(true);
        Map<String, Object> m = new HashMap<>(1);
        m.put("body", user);
        genericResponse.setMapData(m);
        return genericResponse;
    }

    @RequestMapping(value = "/create-user", method = RequestMethod.POST)
    @ResponseBody
    public GenericResponse createUser(@RequestBody User user){
        GenericResponse genericResponse = new GenericResponse();
        genericResponse.setResult(true);
        Map<String, Object> m = new HashMap<>(1);
        m.put("body", user);
        genericResponse.setMapData(m);
        return genericResponse;
    }
}
