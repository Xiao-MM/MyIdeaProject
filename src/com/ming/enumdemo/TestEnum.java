package com.ming.enumdemo;

import java.util.Arrays;

public class TestEnum {
    public static void main(String[] args) {

        Human human = new Human();

        human.setName("zs");
        human.setStatus(Status.BRON);

        System.out.println(human);

        Status[] values = Status.values();
        System.out.println("状态："+ Arrays.toString(values));

        Status death = Status.valueOf("DEATH");
        System.out.println(death);

        System.out.println(Status.ADULT.ordinal());
        System.out.println(Status.BRON.ordinal());
    }
}
