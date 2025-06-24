package spring.study.one_hour_project.user.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController

public class UserController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello wiz";
    }
    

}