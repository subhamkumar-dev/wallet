package com.thoughtworks.wallet.currency;

public enum CurrencyType {
    RUPEE(1/74.85),DOLLAR(74.85);
    public double convertorMultiplyer;

    CurrencyType(double v) {
        convertorMultiplyer =v;
    }
}
