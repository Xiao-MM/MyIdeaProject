package com.ming.stream;

import com.ming.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {

        List<Person> persons = getPerson();
        //串行流
        Stream<Person> stream = persons.stream();
        //并行流
        Stream<Person> personStream = persons.parallelStream();

        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        Stream.iterate(0,n->n+1).limit(10).forEach(System.out::println);

        Stream.generate(Math::random).limit(10).forEach(System.out::println);


    }



    public static List<Person> getPerson(){

        List<Person> persons = new ArrayList<>();
        Person person = new Person(1,"ZS",18);
        Person person1 = new Person(2,"LS",19);
        Person person2 = new Person(3,"WW",20);

        persons.add(person);
        persons.add(person1);
        persons.add(person2);

        return persons;
    }
}
