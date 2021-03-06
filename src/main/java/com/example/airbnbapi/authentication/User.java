package com.example.airbnbapi.authentication;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    private String emailAddress;
    private String password;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
