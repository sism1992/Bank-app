package com.example.bankapp.model;

import javax.validation.constraints.NotEmpty;

public class SearchCriteria {

    @NotEmpty(message = "username can't be empty 2")
    String username;

    public SearchCriteria() {
    }

    public SearchCriteria(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
