package com.ming.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLambda07 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4);

        list.forEach(PrintUtil::printSeparate);
    }
}
class PrintUtil{
    public static void printSeparate(Integer str){
        System.out.print(str+",");
    }
}