package com.ming.lambda;

import com.ming.entity.Person;

interface PersonCreatorBlankConstruct{
    Person getPerson();
}
interface PersonCreatorParamConstruct{
    Person getPerson(Integer id, String name,Integer age);
}

/**
 * 构造方法的引用
 * 一般我们需要声明接口，该接口作为对象的生成器，通过 类名::new 的方式来实例化对象，然后调用方法返回对象。
 */
public class TestLambda04 {
    public static void main(String[] args) {
        PersonCreatorBlankConstruct creator = ()-> new Person();
        System.out.println(creator.getPerson());

        creator = Person::new;
        System.out.println(creator.getPerson());

        PersonCreatorParamConstruct creator1 = Person::new;
        System.out.println(creator1.getPerson(1,"zs",18));
    }
}
