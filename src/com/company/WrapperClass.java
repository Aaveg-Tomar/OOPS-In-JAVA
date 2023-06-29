package com.company;

public class WrapperClass {
    public static void main(String[] args) {
        Integer num = 10;
        Integer lnum2 = 20 ;
        int a = 20;

        int x =  num.compareTo(lnum2);
        int x1 =  lnum2.compareTo(num);
        System.out.println( x);
        System.out.println(x1);
    }
}
