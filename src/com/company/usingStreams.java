package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class usingStreams {
    public static void main(String [] args)
    {
        System.out.println("Table of 2");
        //int array[]={1,2,3,4,5,6,7,8,9,10};
        Range(1,10).stream()
                .map(x->x+"*2="+x*2)
                .forEach(System.out::println);

        System.out.println("Table of 3");
        //int array[]={1,2,3,4,5,6,7,8,9,10};
        List<String> list=Range(1,10).stream()
                .map(x->x+"*3="+x*3)
                .collect(Collectors.toList());
        System.out.println(list);

        System.out.println("Odd no. in range 1 to 10");
        Range(1,10).stream()
                .filter(number->isOdd(number))
                .forEach(System.out::println);
    }

    public static boolean isOdd(int number)
    {
        return (number%2!=0);
    }

    public static List<Integer> Range(int left, int right){
        List<Integer> list= new ArrayList<>();
        for(int i=left;i<=right;i++){
            list.add(i);
        }
        return list;
    }
}
