package com.ming.collection.unsafe;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person person = new Person("zs",10);
        Person person1 = new Person("ls",20);
        list.add(person);
        list.add(person1);
        for (Person p:list){
            p.setName("ww");
        }
        System.out.println(list);
    }
}
class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}