package com.ming.collection.safe;

import java.util.concurrent.CopyOnWriteArrayList;

public class TestCopyOnWriteArrayList {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                cowList.add("hhh"+Math.random());
            }).start();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(cowList.size());
    }
}
