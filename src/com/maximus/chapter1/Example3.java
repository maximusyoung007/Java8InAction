package com.maximus.chapter1;

import com.maximus.model.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//方法作为参数传递
public class Example3 {
    public void Example3() {
        List<Apple> appleList = new ArrayList() {{
            add(new Apple("110", "green"));
            add(new Apple("110", "red"));
            add(new Apple("99", "green"));
        }};

        List<Apple> result1 = filterHeavyApples(filterGreenApples(appleList));
        for (Apple apple : result1) {
            System.out.println(apple.getWeight() + "----" + apple.getColor());
        }

        System.out.println("java8----");
        //写法1
//        List<Apple> resultTemp = filterApple(appleList, Example3::isGreenApple);
//        List<Apple> result2 = filterApple(resultTemp, Example3::isHeavyApple);
        //写法2
//        List<Apple> resultTemp = filterApple(appleList, apple -> "green".equals(apple.getColor()));
//        List<Apple> result2 = filterApple(resultTemp, apple -> 100 < Integer.parseInt(apple.getWeight()));
        //写法3，最简便的方法
        List<Apple> result2 = filterApple(appleList, (Apple apple) -> "green".equals(apple.getColor())
                && 100 < Integer.parseInt(apple.getWeight()));
        for (Apple apple : result2) {
            System.out.println(apple.getWeight() + "------" + apple.getColor());
        }

    }

    public static List<Apple> filterGreenApples(List<Apple> apples) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals("green")) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> apples) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (Integer.parseInt(apple.getWeight()) > 100) {
                result.add(apple);
            }
        }
        return result;
    }

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return 100 < Integer.parseInt(apple.getWeight());
    }

    public static List<Apple> filterApple(List<Apple> appleList, Predicate<Apple> p) {
        List<Apple> res = new ArrayList<>();
        for (Apple a : appleList) {
            //方法作为参数，验证符合定义的方法
            if (p.test(a)) {
                res.add(a);
            }
        }
        return res;
    }
}
