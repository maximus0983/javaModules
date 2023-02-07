package com.epam.service.api;

import com.epam.api.BankCard;
import com.epam.api.Subscription;
import com.epam.api.User;

import java.util.List;
import java.util.Optional;

public interface Service {

    void subscribe(Subscription subscription);

    Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber);

    List<User> getAllUsers();

}
