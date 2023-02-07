package com.epam.dao;

import com.epam.api.BankCard;
import com.epam.api.Subscription;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankCardDaoImpl implements BankCardDao{
    private List<Subscription> subscriptions = new ArrayList<>();
    private List<BankCard> bankCards = new ArrayList<>();
    @Override
    public void subscribe(Subscription subscription) {
        subscriptions.add(subscription);
    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber) {
        return subscriptions.stream()
                .filter(subscription -> subscription.getBankCard().equals(cardNumber))
                .findFirst();
    }

    @Override
    public BankCard create(BankCard bankCard) {
        bankCards.add(bankCard);
        return bankCard;
    }
}
