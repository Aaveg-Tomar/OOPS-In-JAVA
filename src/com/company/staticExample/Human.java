package com.company.staticExample;

public class Human {
    int age;
    String name;
    int sal;
    boolean married;
    static  long population ;

   public Human(int age , String name , int sal , boolean married)
   {
       this.age = age;
       this.name = name;
       this.sal = sal;
       this.married = married;

       this.population += 1;
   }

    public Human() {

    }
}
