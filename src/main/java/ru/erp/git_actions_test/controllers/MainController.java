package ru.erp.git_actions_test.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public ResponseEntity<String>getResponse(){
        return new ResponseEntity<>("Test response on port 9099 v1.0.0 ", HttpStatus.OK);
    }

}
