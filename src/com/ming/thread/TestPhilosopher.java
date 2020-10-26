package com.ming.thread;

public class TestPhilosopher {
    public static void main(String[] args) {
        int[] chopstick = new int[]{1,1,1,1,1};
        int count = 4;
//        new Thread(new Philosopher1(0,chopstick),"哲学家0").start();
//        new Thread(new Philosopher1(1,chopstick),"哲学家1").start();
//        new Thread(new Philosopher1(2,chopstick),"哲学家2").start();
//        new Thread(new Philosopher1(3,chopstick),"哲学家3").start();
//        new Thread(new Philosopher1(4,chopstick),"哲学家4").start();
        new Thread(new Philosopher2(0,chopstick,count),"哲学家0").start();
        new Thread(new Philosopher2(1,chopstick,count),"哲学家1").start();
        new Thread(new Philosopher2(2,chopstick,count),"哲学家2").start();
        new Thread(new Philosopher2(3,chopstick,count),"哲学家3").start();
        new Thread(new Philosopher2(4,chopstick,count),"哲学家4").start();
    }


}
class Philosopher1 implements Runnable{
    private int position;
    private int[] chopstick;

    public Philosopher1(int position, int[] chopstick) {
        this.position = position;
        this.chopstick = chopstick;
    }

    @Override
    public void run() {
        philosopher(chopstick, position);
    }

    synchronized void philosopher(int[] arr, int i){
        while (true){
            System.out.println(Thread.currentThread().getName()+"思考...");
            p(arr,i);
            p(arr,(i+1)%5);
            System.out.println(Thread.currentThread().getName()+"吃饭...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            v(arr,i);
            v(arr,(i+1)%5);
        }
    }

    synchronized void p(int[] arr,int i){
        if (arr[i] > 0){
           arr[i]--;
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    void v(int[] arr, int i){
        arr[i]++;
        notifyAll();
    }
}
class Philosopher2 implements Runnable{
    private int position;
    private int[] chopstick;
    private final int count;
    public Philosopher2(int position, int[] chopstick ,int count) {
        this.position = position;
        this.chopstick = chopstick;
        this.count = count;
    }

    @Override
    public void run() {
        philosopher(chopstick, position);
    }


    synchronized void philosopher(int[] arr, int i){
        while (true){
            p(count);
            System.out.println(Thread.currentThread().getName()+"思考...");
            p(arr,i);
            p(arr,(i+1)%5);
            System.out.println(Thread.currentThread().getName()+"吃饭...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            v(arr,i);
            v(arr,(i+1)%5);
            v(count);
        }
    }

    synchronized void p(int[] arr,int i){
        if (arr[i] > 0){
            arr[i]--;
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    synchronized void p(int count){
        if (count > 0){
            count--;
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    synchronized void v(int[] arr, int i){
        if (arr[i]<1){
            arr[i]++;
        }
        notifyAll();
    }
    synchronized void v(int count){
        if (count<4){
            count++;
        }
        notifyAll();
    }

}
