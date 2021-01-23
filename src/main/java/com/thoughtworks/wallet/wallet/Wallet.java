package com.thoughtworks.wallet.wallet;

import com.thoughtworks.wallet.currency.CurrencyType;
import com.thoughtworks.wallet.exception.LowAmountException;

public class Wallet {
    private double money;
    private double withdrawMoney;
    CurrencyType currencyPreference;

    public Wallet(double money, CurrencyType currencyPreference) {
        this.money = money;
        this.currencyPreference = currencyPreference;
    }

    public void withdraw(double value) throws LowAmountException {
        if (value > money) throw new LowAmountException("Availabe Amount is Low to Withdraw the amount");

        this.money -= value;
        withdrawMoney = value;
    }

    public double getWithdrawMoney() {
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

    public double getTotalMoneyAvailable() {
        return money;
    }
}
