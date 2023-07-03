package com.company.Polymorphism;

public class Numbers {
    public  int abc(int a , int b)
    {
        return a+b;
    }
    public int abc(int a , int b , int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();

        System.out.println( num.abc(1,2));
        System.out.println(  num.abc(1,2,3));
    }
}

