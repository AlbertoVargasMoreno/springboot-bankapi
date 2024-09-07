package com.tryout.bankapp.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import com.tryout.bankapp.entity.Account;

@RestController
@RequestMapping("/account")
public class AccountController {
    //create the account
    @PostMapping("/create")    
    public Account createAccount(@RequestBody Account account) {
        return null;
    }
}
