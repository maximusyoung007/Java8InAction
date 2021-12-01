package com.maximus.chapter2;

import com.maximus.data.BananaList;
import com.maximus.model.Banana;
import com.maximus.myInterface.BananaFormat;

import java.util.List;

//行为参数化
public class Exercise2_1 {
    public void exercise2_1() {
        List<Banana> list = BananaList.getBananaList();
        prettyPrintBanana(list, new PrintBananaColor());
        prettyPrintBanana(list, new PrintBananaWeight());
    }

    public void prettyPrintBanana(List<Banana> list, BananaFormat format) {
        for (Banana b : list) {
            format.printBanana(b);
        }
    }
}
