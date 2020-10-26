package com.ming.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa","bb","cc","dd");
        List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> nums = Arrays.asList(1,2,3,4);
        List<Integer> collect1 = nums.stream().map(n -> n * 10).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
