package Abstraction;

public abstract class Parent {
    int age;

    Parent(int age)
    {
        this.age = age;
    }

    static void abc(){
        System.out.println("Static");
    }

    void normal(){
        System.out.println("Normal");
    }
    abstract void career();
    abstract void partner();
}
