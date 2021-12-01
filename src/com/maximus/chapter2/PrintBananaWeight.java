package com.maximus.chapter2;

import com.maximus.model.Banana;
import com.maximus.myInterface.BananaFormat;

public class PrintBananaWeight implements BananaFormat {
    @Override
    public void printBanana(Banana banana) {
        System.out.println(banana.getWeight());
    }
}
