package com.epam.myapp;

import com.epam.api.BankCard;
import com.epam.api.BankCardType;
import com.epam.api.User;
import com.epam.bank.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    private Bank bank;

    @PostMapping("create")
    public BankCard createBankCard(@RequestBody User user, BankCardType type) {
        return bank.createBankCard(user, type);
    }

}
