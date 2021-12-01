package com.maximus.chapter2;

import com.maximus.model.Banana;
import com.maximus.myInterface.BananaPredicate;

public class BananaGreenColorPredicate implements BananaPredicate {
    public boolean test(Banana banana) {
        return "green".equals(banana.getColor());
    }
}
