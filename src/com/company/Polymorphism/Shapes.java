package com.company.Polymorphism;

public class Shapes {
    void area()
    {
        System.out.println("I am in Shapes");
    }

    // static method cannot override
    //reason - static method does not depend on the objects
    static void abc()
    {
        System.out.println("Let's check ");
    }
}
