package com.ming.thread;

public class TestConsumerAndProducer {

    public static void main(String[] args) {
        Goods goods = new Goods();
        new Thread(new Producer(goods)).start();
        new Thread(new Consumer(goods)).start();
    }
}

class Consumer implements Runnable{
    private Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while(true){
            goods.consume();
        }

    }
}

class Producer implements Runnable{
    private Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while(true){
            goods.produce();
        }

    }

}
class Goods {
    int num = 0;
    int max = 10;
    public synchronized void produce(){

            try {
                while (num == max) {
                    this.wait();
                }
                num++;
                Thread.sleep(100);
                System.out.println("生产者生产了第-->" + num + "件商品！");
                this.notifyAll();
            }catch (InterruptedException e){
                e.printStackTrace();
            }

    }
    public synchronized void consume(){

            try {
                while (num == 0) {
                    this.wait();
                }
                System.out.println("消费者消费了第-->" + num + "件商品！");
                num--;
                Thread.sleep(100);
                this.notifyAll();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
    }
}
