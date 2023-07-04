package com.company.Encapsulation;

public class Example {
    public static void main(String[] args) {
        Xyz obj = new Xyz();

        obj.setAge();



        System.out.println( obj.getAge(12));
        System.out.println( obj.getName("Hello"));

    }
}

class Xyz{
    // private is also used to hide the data
    private int age;
    private String name;


    public int getAge(int age)
    {
        return age;
    }

    public void setAge()
    {
        this.age = age;
    }


    public String getName(String name)
    {
        return name;
    }
}
