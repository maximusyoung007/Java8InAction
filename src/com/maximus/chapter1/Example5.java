package com.maximus.chapter1;

import com.maximus.model.Banana;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//顺序与并行
public class Example5 {
    public void example5() {
        List<Banana> bananaList = new ArrayList() {{
            add(new Banana(110, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
            add(new Banana(100, "white"));
        }};
        long l1 = System.currentTimeMillis();
        List<Banana> heavyList = bananaList.stream().filter(b -> b.getWeight() > 100).collect(Collectors.toList());
        heavyList.forEach(val -> {
            System.out.println(val.getWeight() + "---" + val.getColor());
        });
        long l2 = System.currentTimeMillis();
        System.out.println(l2 - l1);

        long l3 = System.currentTimeMillis();
        List<Banana> heavyList2 = bananaList.parallelStream().filter(b -> b.getWeight() > 100).collect(Collectors.toList());
        heavyList2.forEach(val -> {
            System.out.println(val.getWeight() + "---" + val.getColor());
        });
        long l4 = System.currentTimeMillis();
        System.out.println(l4 - l3);
    }
}
