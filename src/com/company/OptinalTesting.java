package com.company;

import java.util.Optional;

public class OptinalTesting {

    public static void main(String[] args) {
        //Java8Testing java8Testing=new Java8Testing();
        Integer value1 = null;
        Integer value2 = new Integer(10);

        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.ofNullable(value2);

        System.out.println(new OptinalTesting().sum(a, b));
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b) {
        System.out.println("A is A present " + a.isPresent());
        System.out.println("B is present " + b.isPresent());

        Integer value1 = a.orElse(new Integer(0));
        Integer value2 = b.get();

        return value1 + value2;
    }
}
