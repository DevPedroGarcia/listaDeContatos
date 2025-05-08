package com.hpg.login.controller;


import com.hpg.login.LoginApplication;
import com.hpg.login.models.LoginModel;
import com.hpg.login.service.LoginService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }



    @PostMapping
    public ResponseEntity<?> Login(@Valid @RequestBody LoginModel loginModel) {
        return loginService.VerifyLoginAndPassoword(loginModel);
    }
}