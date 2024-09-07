package com.tryout.bankapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tryout.bankapp.entity.Account;

@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public Account createAccount(Account account) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createAccount'");
    }

    @Override
    public Account getAccountDetailsByAccountNumber(Long accountNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAccountDetailsByAccountNumber'");
    }

    @Override
    public List<Account> getAllAccountDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAccountDetails'");
    }

    @Override
    public Account depositAmount(Long accountNumber, Double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositAmount'");
    }

    @Override
    public Account withdrawAmout(Long accountNumber, Double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdrawAmout'");
    }

    @Override
    public void closeAccount(Long accountNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'closeAccount'");
    }
    
}
