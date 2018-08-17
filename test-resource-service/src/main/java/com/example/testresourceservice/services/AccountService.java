package com.example.testresourceservice.services;

import com.example.testresourceservice.stet.model.AccountResource;
import com.example.testresourceservice.stet.model.HalAccounts;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService {
    HalAccounts getAccounts(String sub);
    List<AccountResource> getAccountResources(String sub);
}
