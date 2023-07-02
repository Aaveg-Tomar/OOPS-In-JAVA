package com.company.NonStaticInsideStatic;

public class Main {
    
    public static void main(String[] args) {
        Main mn = new Main();
        mn.greeting();
        fun();
        
    }

    // fun is not dependent on the object
    static  void fun()
    {
       //  greeting();  // you can't use because it requires an instance
        // but the function you are using it in does not depend on instance.

        // You can not access non static stuff without referencing their in
        // a static context.
        Main mn1 = new Main();
        mn1.greeting();
    }
    
    // we know that something which is not static , belong to an object
    void greeting()
    {
       //  fun();
        System.out.println("hello world");
    }
}
