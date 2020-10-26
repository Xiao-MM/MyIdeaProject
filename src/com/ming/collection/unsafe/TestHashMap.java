package com.ming.collection.unsafe;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {

        Map<Double,Double> map = new HashMap<>();
        Map<Object,Object> map1 = new HashMap<>(10,0.5f);

        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                map.put(Math.random(),Math.random());
            }).start();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(map.size());
    }
    Map map = new LinkedHashMap();

}
