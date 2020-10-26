package com.ming.stream;

import com.ming.entity.Person;

import java.util.*;
import java.util.concurrent.FutureTask;
import java.util.stream.Collectors;

public class TestStream01 {
    public static void main(String[] args) {
        //testFilter();
        //testForEachAndLimit();
        //testMap();
        //testSort();
        //testCollectors();
        //testStatistics();
        //testToMap();
        //testHashMap();
        testReduce();
    }
    public static void testFilter(){
        List<String> list = Arrays.asList("aa","","Love","teacher","exe");
        List<String> collect = list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        list.forEach(System.out::println);
        collect.forEach(System.out::println);
    }
    public static void testForEachAndLimit(){
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
    public static void testMap(){
        List<Integer> list = Arrays.asList(1,4,5,7,7,10);
        List<Integer> collect = list.stream().map(a -> a * 10).distinct().collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
    public static void testSort(){
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }
    public static void testCollectors(){
        List<String> list = Arrays.asList("aa","","Love","teacher","exe");
        String collect = list.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining("-"));
        System.out.println(collect);
    }
    public static void testStatistics(){
        List<Integer> list = Arrays.asList(1,4,5,7,7,10);
        IntSummaryStatistics statistics = list.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(statistics.getMax());
        System.out.println(statistics.getCount());
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getSum());
    }
    public static void testToMap(){

        List<Person> list = new ArrayList();

        list.add(new Person(1,"zs",18));
        list.add(new Person(2,"ls",19));
        list.add(new Person(3,"ww",20));

        Map<Integer,Person> map = list.stream().collect(Collectors.toMap(Person::getId,v->v,(k,v)->v));
        System.out.println(map);

        Map<Integer, String> map1 = list.stream().collect(Collectors.toMap(Person::getId, Person::getName, (v1, v2) -> v1));
        System.out.println(map1);
    }

    public static void testHashMap(){
        List<Person> persons = new ArrayList<>();
        Collections.addAll(
                persons,
                new Person(1,"zs",18),
                new Person(2,"ls",19),
                new Person(3,"ww",20)
        );
        Map<Integer, Person> personMap = persons.stream().collect(Collectors.toMap(Person::getId, v -> v, (k1, k2) -> k1));

        personMap.keySet().stream().map(id->{
            if (personMap.get(id).getId()==1){
                personMap.get(id).setAge(personMap.get(id).getAge()+1);
            }
            if (personMap.get(id).getId()>1){
                personMap.get(id).setAge(personMap.get(id).getAge()+2);
            }
            return personMap.get(id);
        }).collect(Collectors.toList());
        //keySet()取出map集合中的所有key放入set集合中
        System.out.println(personMap);
    }
    public static void testReduce(){
        int[] arr = new int[]{1,2,3,4,5,6};
        int sum = Arrays.stream(arr).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
