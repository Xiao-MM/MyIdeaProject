package com.ming.lambda;

/**
 * 方法归属者::方法名 静态方法的归属者为类名，普通方法归属者为对象
 */
public class TestLambda03 {
    public static void main(String[] args) {

        MyInterface.OneParamReturn oneParamReturn1 = a -> doubleNum(a);
        System.out.println(oneParamReturn1.method(1));

        //引用了已经实现的 doubleNum 方法
        MyInterface.OneParamReturn oneParamReturn2 = TestLambda03::doubleNum;
        System.out.println(oneParamReturn2.method(2));

        TestLambda03 testLambda03 = new TestLambda03();

        //引用了已经实现的 addTwo 方法
        MyInterface.OneParamReturn oneParamReturn3 = testLambda03::addTwo;
        System.out.println(oneParamReturn3.method(1));
    }
    public static int doubleNum(int a){
        return a*2;
    }

    public int addTwo(int a){
        return a+2;
    }
}
