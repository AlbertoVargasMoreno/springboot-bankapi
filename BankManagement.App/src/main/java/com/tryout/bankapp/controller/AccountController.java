package com.tryout.bankapp.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import com.tryout.bankapp.entity.Account;
import com.tryout.bankapp.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService service;

    //create the account
    @PostMapping("/create")    
    public Account createAccount(@RequestBody Account account) {
        Account createdAccount = service.createAccount(account);
        return createdAccount;
    }
}
