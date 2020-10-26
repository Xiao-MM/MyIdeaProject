package com.ming.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLambda06 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);

        list.forEach(System.out::println);

        System.out.println("#################");
        list.forEach(element->{
            if (element%2==0){
                System.out.println(element);
            }
        });
    }
}
