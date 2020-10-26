package com.ming.lambda;

import com.ming.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class TestLambda08 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person(2,"LS",19));
        persons.add(new Person(1,"ZS",18));
        persons.add(new Person(3,"WW",20));
        persons.forEach(System.out::println);
//        persons.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getId()-o2.getId();
//            }
//        });
        persons.sort((o1, o2) -> o1.getId()-o2.getId());

        persons.forEach(System.out::println);

        persons.removeIf(person -> person.getId()==2);

        persons.forEach(System.out::println);


    }
}
