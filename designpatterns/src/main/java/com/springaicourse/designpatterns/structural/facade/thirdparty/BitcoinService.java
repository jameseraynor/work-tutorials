package com.springaicourse.designpatterns.structural.facade.thirdparty;

public class BitcoinService extends CryptoService{
    @Override
    public void buyCurrency(User user, double amount) {
        System.out.println("Buying " + amount + " of Bitcoin...");
    }

}
