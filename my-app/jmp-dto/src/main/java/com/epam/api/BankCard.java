package com.epam.api;

public class BankCard {
    private String number;
    private User user;

    private BankCardType bankCardType;

    public BankCard(User user) {
        this.user = user;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
