package com.company.ThisInsideStatic;


// this is a demo to show initialization of static variable
public class InitStatic {
    static  int a = 4;
    static  int b;


    // it is called only once when the object is loading first time
    static {
        System.out.println("I am a static block");
        b = a*5;
    }

    public static void main(String[] args) {
        InitStatic st = new InitStatic();

        System.out.println(InitStatic.a + " " + InitStatic.b);

        InitStatic.b = b+3;

        System.out.println(InitStatic.a + " " + InitStatic.b);

        InitStatic st2 = new InitStatic();

        // a = a+2;

        System.out.println(InitStatic.a + " " + b);


    }
}
