package com.hpg.login.service;

import com.hpg.login.models.LoginModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public ResponseEntity<?> VerifyLoginAndPassoword(LoginModel loginModel){
        if (loginModel.getEmail().equals("garcia@gmail.com") && loginModel.getPassword().equals("1234")){
            loginModel.setEmail("teste funcionou");
            loginModel.setPassword("uhuu foi");
        }
        return ResponseEntity.ok().body(loginModel);
    }
}
