package com.company.ThisInsideStatic;

public class Human {

    int age;
    String name;
    boolean married;

    static  void  abc()
    {
        Human hm1 = new Human();
        hm1.xyz();
        System.out.println("hello");
//        System.out.println(this.age);  cannot use this inside the static
    }

    void xyz()
    {
        System.out.println("Humans");
    }

    Human(){}

     public Human(int age ,String name , boolean married)
    {
        this.age = age;
        this.name = name;
        this.married = married;
    }
}
