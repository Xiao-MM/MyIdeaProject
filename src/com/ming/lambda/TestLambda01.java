package com.ming.lambda;

public class TestLambda01 {
    public static void main(String[] args) {
        MyInterface.NoParamNoReturn noParamNoReturn = ()->{
            System.out.println("noParamNoReturn");
        };
        noParamNoReturn.method();

        MyInterface.OneParamNoReturn oneParamNoReturn = (int a)->{
            System.out.println("oneParamNoReturn");
        };
        oneParamNoReturn.method(1);

        MyInterface.MultiParamNoReturn multiParamNoReturn = (int a,int b)->{
            System.out.println("multiParamNoReturn");
        };
        multiParamNoReturn.method(1,2);

        MyInterface.NoParamReturn noParamReturn = ()->{
            System.out.println("noParamReturn");
            return -1;
        };
        System.out.println(noParamReturn.method());

        MyInterface.OneParamReturn oneParamReturn = (int a)->{
            System.out.println("oneParamReturn");
            return a;
        };
        System.out.println(oneParamReturn.method(10));

        MyInterface.MultiParamReturn multiParamReturn = (int a,int b)->{
            System.out.println("multiParamReturn");
            return a+b;
        };
        System.out.println(multiParamReturn.method(10,20));
    }
}
