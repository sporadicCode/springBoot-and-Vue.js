package com.myspringbootproject.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("basic")
public class BasicController {

    @GetMapping
    public String respondToGet() {
        return "This is data from spring rest controller";
    }

}
