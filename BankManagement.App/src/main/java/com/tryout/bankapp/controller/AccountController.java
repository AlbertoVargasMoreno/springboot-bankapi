package com.tryout.bankapp.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import com.tryout.bankapp.entity.Account;
import com.tryout.bankapp.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService service;

    //create the account
    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        Account createdAccount = service.createAccount(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAccount);
    }

    @GetMapping("/{id}")
    public Account getAccountByAccountNumber(@PathVariable Long id) {
        Account accountDetails = service.getAccountDetailsByAccountNumber(id);
        return accountDetails;
    }
    
}
