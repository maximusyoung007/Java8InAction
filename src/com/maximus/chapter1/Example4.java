package com.maximus.chapter1;

import com.maximus.model.Transaction;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

//筛选与分组
public class Example4 {
    public void example4() {
        List<Transaction> transactions = new ArrayList() {{
            add(new Transaction("人民币", 100));
            add(new Transaction("人民币", 120));
            add(new Transaction("人民币", 130));
            add(new Transaction("美元", 110));
            add(new Transaction("美元", 120));
            add(new Transaction("美元", 130));
            add(new Transaction("英镑", 110));
            add(new Transaction("英镑", 120));
            add(new Transaction("英镑", 130));
        }};
        Map<String, List<Transaction>> transactionMap = new HashMap<>();
        for (Transaction transaction : transactions) {
            if (transaction.getPrice() >= 110) {
                List<Transaction> list = transactionMap.get(transaction.getCurrency());
                if (list == null) {
                    list = new ArrayList<>();
                    transactionMap.put(transaction.getCurrency(), list);
                }
                list.add(transaction);
            }
        }

        for (Map.Entry set : transactionMap.entrySet()) {
            System.out.print(set.getKey());
            List<Transaction> list = transactionMap.get(set.getKey());
            for (Transaction transaction : list) {
                System.out.print(transaction.getPrice());
            }
            System.out.println();
        }

        System.out.println("java8-----");

        Map<String, List<Transaction>> transactionMap2 = transactions.stream()
                .filter((Transaction t) -> t.getPrice() > 100)
                .collect(groupingBy(Transaction::getCurrency));
        transactionMap2.forEach((k, v) -> {
            System.out.print(k);
            for (Transaction t : v) {
                System.out.print(t.getPrice());
            }
        });
    }
}
