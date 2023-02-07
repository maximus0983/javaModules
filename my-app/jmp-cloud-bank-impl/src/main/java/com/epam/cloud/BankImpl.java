package com.epam.cloud;

import com.epam.api.*;
import com.epam.bank.Bank;
import com.epam.dao.BankCardDao;
import com.epam.dao.BankCardDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class BankImpl implements Bank {
    private final BankCardDao bankCardDao = new BankCardDaoImpl();
    @Override
    public BankCard createBankCard(User user, BankCardType type) {
        BankCard bankCard = null;
        switch (type) {
            case DEBIT:
                bankCard = new DebitBankCard(user);
            break;
            case CREDIT:
                bankCard = new CreditBankCard(user);
                break;
        }
        bankCardDao.create(bankCard);

        return bankCard;
    }
}
