package com.hpg.login.models;

public class LoginModel {
    private String email;
    private String passowrd;

    public LoginModel(final String email, final String passowrd){
        this.email = email;
        this.passowrd = passowrd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }
}
