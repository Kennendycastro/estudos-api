package com.kennendy.first_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/status")
    public String rota(){return "A API está rodando..";}
}
