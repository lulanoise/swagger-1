package co.develhope.swagger.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NameController {

    @ApiOperation(value = "get the name")
    @GetMapping("/name")
    public String getName(){
        return "Lucrezia";
    }

}