package com.thoughtworks.wallet.wallet;

import com.thoughtworks.wallet.currency.CurrencyType;
import com.thoughtworks.wallet.exception.LowAmountException;

public class Wallet {
    private int money;
    private int withdrawMoney;
    CurrencyType currencyPreference;

    public Wallet(int value) {
        this.money = value;
    }

    public Wallet(int money, CurrencyType currencyPreference) {
        this.money = money;
        this.currencyPreference = currencyPreference;
    }

    public void add(int value) {
        this.money += value;
    }

    public void withdraw(int value) throws LowAmountException {
        if (value > money) throw new LowAmountException("Availabe Amount is Low to Withdraw the amount");

        this.money -= value;
        withdrawMoney = value;
    }

    public int getWithdrawMoney() {
        return withdrawMoney;
    }

    public void add(double value, CurrencyType type) {
        if (this.currencyPreference != type)
            value = convertCurrency(value, type);
        this.money += value;
    }

    private double convertCurrency(double value, CurrencyType type) {
        if (type == CurrencyType.DOLLAR)
            return value * 74.85;
        return value / 74.85;
    }
}
