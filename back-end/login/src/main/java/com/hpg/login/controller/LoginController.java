package com.hpg.login.controller;


import com.hpg.login.models.LoginModel;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping
    public ResponseEntity<?> Login(@Valid @RequestBody LoginModel loginModel) {
        return ResponseEntity.ok().body("Hello world");
    }


}