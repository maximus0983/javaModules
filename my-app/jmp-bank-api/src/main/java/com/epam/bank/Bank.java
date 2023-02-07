package com.epam.bank;

import com.epam.api.BankCard;
import com.epam.api.BankCardType;
import com.epam.api.User;
import org.springframework.stereotype.Component;

@Component
public interface Bank {
    BankCard createBankCard(User user, BankCardType type);
}
