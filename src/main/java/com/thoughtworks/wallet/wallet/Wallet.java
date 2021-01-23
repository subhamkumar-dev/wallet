package com.thoughtworks.wallet.wallet;

import com.thoughtworks.wallet.exception.LowAmountException;

public class Wallet {
    private int money;
    private int withdrawMoney;

    public Wallet(int value) {
        this.money = value;
    }

    public void add(int value) {
        this.money += value;
    }

    public void withdraw(int value) throws LowAmountException {
        if(value>money) throw new LowAmountException("Availabe Amount is Low to Withdraw the amount");

        this.money -= value;
        withdrawMoney = value;
    }

    public int getWithdrawMoney() {
        return withdrawMoney;
    }
}
