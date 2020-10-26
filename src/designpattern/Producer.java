package designpattern;

public class Producer {
    public static void main(String[] args) {
        Producer producer1 = Factory.createProducer();
        Producer producer2 = Factory.createProducer();
    }
}
class Factory{
    public static Producer createProducer(){
        return new Producer();
    }
}