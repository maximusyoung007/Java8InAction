package com.maximus.chapter1;

import com.maximus.model.Apple;
import com.maximus.model.Banana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Java8排序
public class Example1 {
    public void sortNew() {
        List<Apple> appleList = new ArrayList() {{
            add(new Apple("3", "blue"));
            add(new Apple("1", "red"));
            add(new Apple("2", "orange"));
        }};

        List<Banana> bananaList = new ArrayList() {{
            add(new Banana(3, "blue"));
            add(new Banana(1, "red"));
            add(new Banana(2, "orange"));
        }};

        //以前的排序
        Collections.sort(appleList, new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return a1.getWeight().compareTo(a2.getWeight());
            }
        });
        appleList.forEach(a -> System.out.println(a.getColor()));

        //Java8的排序
        bananaList.sort(Comparator.comparing(Banana::getWeight));
        bananaList.forEach(b -> System.out.println(b.getColor()));
    }
}
