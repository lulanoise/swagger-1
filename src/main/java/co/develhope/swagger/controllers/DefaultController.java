package co.develhope.swagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to my API!";
    }
}