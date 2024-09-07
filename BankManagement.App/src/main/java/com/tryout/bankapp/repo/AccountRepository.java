package com.tryout.bankapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tryout.bankapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    
}
