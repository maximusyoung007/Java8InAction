package com.maximus.chapter2;

import com.maximus.model.Banana;
import com.maximus.myInterface.BananaFormat;

public class PrintBananaColor implements BananaFormat {
    @Override
    public void printBanana(Banana banana) {
        System.out.println(banana.getColor());
    }
}
