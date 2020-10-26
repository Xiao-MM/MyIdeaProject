package com.ming;

public class TestInterfaceDefaultMethod {

    public static void main(String[] args) {
        A a = new A();
        a.test();

        B b = new B();
        b.test();
    }
}
class  A implements TestDefaultInterface{
}
class B implements TestDefaultInterface{
    @Override
    public void test() {
        System.out.println("B....");
    }
}
class D extends C{

    @Override
    void test2() {

    }

    @Override
    void test1() {
        super.test1();
    }
}
abstract class C{
    void test1(){
        System.out.println("C1...");
    }
    abstract void test2();
}