package com.maximus.chapter2;

import com.maximus.model.Banana;
import com.maximus.myInterface.BananaPredicate;

public class BananaHeavyWeightPredicate implements BananaPredicate {
    public boolean test(Banana banana) {
        return banana.getWeight() > 100;
    }
}
