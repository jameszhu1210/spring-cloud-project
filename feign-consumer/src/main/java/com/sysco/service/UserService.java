package com.sysco.service;

import com.sysco.request.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import response.GenericResponse;

@FeignClient("frdt-service")
public interface UserService {

    @RequestMapping("/frdt-ws/frdt/find-user")
    GenericResponse findUser(@RequestParam("name") String name, @RequestParam("address") String address);

    @RequestMapping(value = "/frdt-ws/frdt/create-user", method = RequestMethod.POST)
    GenericResponse createUser(@RequestBody User user);
}
