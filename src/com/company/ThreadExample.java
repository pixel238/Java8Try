package com.company;

public class ThreadExample {
    public static void main(String[] args)
    {
        ThreadExample threadExample =new ThreadExample();
        Thread thread1 = new Thread(threadExample::printNum);
        thread1.start();

        Thread thread2 = new Thread(()->threadExample.printNum());
        thread2.start();
    }

    void printNum()
    {
        for (int i=0;i<100;i++) {
            System.out.println(i);
        }
    }
}
