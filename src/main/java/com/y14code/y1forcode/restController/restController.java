package com.y14code.y1forcode.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

    @GetMapping("/")
public String merhabaDe(){
    return "naber la";
}


}




