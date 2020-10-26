package com.ming.lambda;

public class TestLambda05 {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i =0;i<10000;i++){
                System.out.println("T-->"+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
