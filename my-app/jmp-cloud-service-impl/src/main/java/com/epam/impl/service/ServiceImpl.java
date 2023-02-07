package com.epam.impl.service;

import com.epam.api.Subscription;
import com.epam.api.User;
import com.epam.dao.BankCardDao;
import com.epam.dao.BankCardDaoImpl;
import com.epam.dao.UserDao;
import com.epam.dao.UserDaoImpl;
import com.epam.service.api.Service;

import java.util.List;
import java.util.Optional;

public class ServiceImpl implements Service {
    private final BankCardDao bankCardDao = new BankCardDaoImpl();
    private final UserDao userDao = new UserDaoImpl();

    @Override
    public void subscribe(Subscription subscription) {
        bankCardDao.subscribe(subscription);
    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber) {
        return bankCardDao.getSubscriptionByBankCardNumber(cardNumber);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAll();
    }
}
