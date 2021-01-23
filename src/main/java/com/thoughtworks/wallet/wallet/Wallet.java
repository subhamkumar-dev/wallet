package com.thoughtworks.wallet.wallet;

public class Wallet {
    private int money;
    private int withdrawMoney;

    public Wallet(int value) {
        this.money = value;
    }

    public void add(int value) {
        this.money += value;
    }

    public void withdraw(int value) {
        this.money -= value;
        withdrawMoney = value;
    }

    public int getWithdrawMoney() {
        return withdrawMoney;
    }
}
