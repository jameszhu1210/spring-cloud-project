package com.sysco.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import response.GenericResponse;

@FeignClient("frdt-service")
public interface LogService {

    @RequestMapping("/frdt-ws/frdt/select-log-list")
    GenericResponse selectLogList();
}
