package com.thoughtworks.wallet.wallet;

public class Wallet {
    private int money;

    public Wallet(int value) {
        this.money = value;
    }

    public void add(int value) {
        this.money += value;
    }

}
