package com.example.sea.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exposure {

    public ResponseEntity<String> displayHuman(){
        return new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }
}
