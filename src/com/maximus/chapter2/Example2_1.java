package com.maximus.chapter2;

import com.maximus.data.BananaList;
import com.maximus.model.Banana;
import com.maximus.myInterface.BananaPredicate;

import java.util.ArrayList;
import java.util.List;

//筛选苹果
public class Example2_1 {
    public void example2_1() {
        List<Banana> list = BananaList.getBananaList();
        List<Banana> res1 = new ArrayList<>();
        List<Banana> res2 = new ArrayList<>();
//        for (Banana banana : list) {
//            if ("green".equals(banana.getColor())) {
//                res1.add(banana);
//            }
//        }
        res1 = filterBananaByColor(list, "green");
        res2 = filterBananaByColor2(list, new BananaGreenColorPredicate());
        System.out.println(res1.size() + "----" + res2.size());
    }

    public List<Banana> filterBananaByColor(List<Banana> list, String color) {
        List<Banana> res1 = new ArrayList<>();
        for (Banana banana : list) {
            if (color.equals(banana.getColor())) {
                res1.add(banana);
            }
        }
        return res1;
    }

    public List<Banana> filterBananaByColor2(List<Banana> list, BananaPredicate predicate) {
        List<Banana> res = new ArrayList<>();
        for (Banana banana : list) {
            if (predicate.test(banana)) {
                res.add(banana);
            }
        }
        return res;
    }

    public List<Banana> filterBananaByWeight(List<Banana> list, int weight) {
        List<Banana> res1 = new ArrayList<>();
        for (Banana banana : list) {
            if (banana.getWeight() > weight) {
                res1.add(banana);
            }
        }
        return res1;
    }
}
