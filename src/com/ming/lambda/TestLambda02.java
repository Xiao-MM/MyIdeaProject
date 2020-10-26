package com.ming.lambda;

public class TestLambda02 {
    public static void main(String[] args) {

        MyInterface.MultiParamNoReturn multiParamNoReturn = (a,b)->{
            System.out.println("简化掉参数类型");
        };

        MyInterface.OneParamNoReturn oneParamNoReturn = a ->{
            System.out.println("简化掉小括号-->"+a);
        };
        oneParamNoReturn.method(1);

        oneParamNoReturn = a -> System.out.println("简化掉小括号和大括号-->"+a);
        oneParamNoReturn.method(2);

        //3.简化方法体大括号，如果方法条只有一条语句，则可以省略方法体大括号
        MyInterface.NoParamNoReturn noParamNoReturn = ()-> System.out.println("方法只有一条语句简化方法体！");

        noParamNoReturn.method();

        //4.如果方法体只有一条语句，并且是 return 语句，则可以省略方法体大括号
        MyInterface.OneParamReturn oneParamReturn = a -> a*2;
        System.out.println(oneParamReturn.method(10));

        MyInterface.MultiParamReturn multiParamReturn = (a,b)-> a+b;
        System.out.println(multiParamReturn.method(10,15));


    }
}
