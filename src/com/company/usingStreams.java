package com.company;

import java.util.ArrayList;
import java.util.List;

public class usingStreams {
    public static void main(String [] args)
    {
        System.out.println("Hello");
        int array[]={1,2,3,4,5,6,7,8,9,10};
        Range(1,10).stream().
                map(x->x).
                forEach(System.out::println);
    }

    public static List<Integer> Range(int left, int right){
        List<Integer> list= new ArrayList<>();
        for(int i=left;i<=right;i++){
            list.add(i);
        }
        return list;
    }
}
