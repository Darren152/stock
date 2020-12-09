package com.account.email.service;

import com.account.email.model.Account;
import com.account.email.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    
    @Autowired
    AccountRepository accountRepository;

    public Optional<Account> getAccountById(Long Id){
        return accountRepository.findById(Id);
    }

    public Iterable<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    public Account createAccount(Account account){
        return accountRepository.save(account);
    }

    public void deleteAccount(Long Id){
        accountRepository.deleteById(Id);
    }
}
