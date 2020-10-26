package com.ming.collection;

public class TestParam {
    public static void test(String... key){
        for (int i = 0; i < key.length; i++){
            System.out.println(key[i]);
        }
    }
    public static void main(String[] args) {
        test("zs","ls","ww");
    }
}
