package com.server.example.demo.view;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/init")
public class InitController {

    @GetMapping
    public ResponseEntity<?> getHello() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello");
    }
}
