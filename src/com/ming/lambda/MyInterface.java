package com.ming.lambda;

public class MyInterface {
    @FunctionalInterface
    public interface NoParamNoReturn{
        void method();
    }
    @FunctionalInterface
    public interface OneParamNoReturn{
        void method(int a);
    }

    @FunctionalInterface
    public interface MultiParamNoReturn{
        void method(int a,int b);
    }

    @FunctionalInterface
    public interface NoParamReturn{
        int method();
    }

    @FunctionalInterface
    public interface OneParamReturn{
        int method(int a);
    }

    @FunctionalInterface
    public interface MultiParamReturn{
        int method(int a,int b);
    }
}
