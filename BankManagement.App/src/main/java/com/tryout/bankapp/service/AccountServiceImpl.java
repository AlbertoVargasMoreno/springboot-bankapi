package com.tryout.bankapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tryout.bankapp.entity.Account;
import com.tryout.bankapp.repo.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository repo;

    @Override
    public Account createAccount(Account account) {
        Account savedAccount = repo.save(account);
        return savedAccount;
    }

    @Override
    public Account getAccountDetailsByAccountNumber(Long accountNumber) {
        Optional<Account> account = repo.findById(accountNumber);
        if (account.isEmpty()) {
            throw new RuntimeException("Account is not present");
        }
        Account found_account = account.get();
        return found_account;
    }

    @Override
    public List<Account> getAllAccountDetails() {
        List<Account> listOfAccounts = repo.findAll();
        return listOfAccounts;
    }

    @Override
    public Account depositAmount(Long accountNumber, Double amount) {
        Optional<Account> account = repo.findById(accountNumber);
        if (account.isEmpty()) {
            throw new RuntimeException("Account is not present");
        }
        Account currentAccount = account.get();
        Double totalBalance = currentAccount.getAccount_balance() + amount;
        currentAccount.setAccount_balance(totalBalance);
        repo.save(currentAccount);
        return currentAccount;
    }

    @Override
    public Account withdrawAmout(Long accountNumber, Double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdrawAmout'");
    }

    @Override
    public String closeAccount(Long accountNumber) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'closeAccount'");
        Optional<Account> account = repo.findById(accountNumber);
        if (account.isEmpty()) {
            throw new RuntimeException("Account is not present");
        }
        Account found_account = account.get();
        // return found_account;
        repo.delete(found_account);
        String message = "account closed with id: " + accountNumber;
        return message;
    }
}
