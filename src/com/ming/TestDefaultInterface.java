package com.ming;

public interface TestDefaultInterface {
    default void test(){
        System.out.println("testDefaultMethod");
    }
}
