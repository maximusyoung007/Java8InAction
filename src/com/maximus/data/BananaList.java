package com.maximus.data;

import com.maximus.model.Banana;

import java.util.ArrayList;
import java.util.List;

public class BananaList {
    public static List<Banana> getBananaList() {
        String[] color = new String[] {"yellow", "green", "red", "orange", "blue", "white", "purple"};
        List<Banana> res = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            res.add(new Banana((int)(Math.random() * 100 + 50), color[(int)(Math.random() * 7)]));
        }
        return res;
    }
}
