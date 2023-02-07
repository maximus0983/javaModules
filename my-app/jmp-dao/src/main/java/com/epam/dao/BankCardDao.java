package com.epam.dao;

import com.epam.api.BankCard;
import com.epam.api.Subscription;

import java.util.Optional;

public interface BankCardDao {

    void subscribe(Subscription subscription);

    Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber);

    BankCard create(BankCard bankCard);
}
