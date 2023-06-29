package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      Student kunal = new Student("Aaveg" , 1 , 90 );
//        Student[] std = new Student[5];

//        Student kunal = new Student();

        // call the change function
        kunal.changename("Aayush");

        kunal.greeting();

//        for (int i = 0; i < 5; i++) {
//            String x = in.next();
//            int y = in.nextInt();
//            int z = in.nextInt();
//
//           Student a =  new Student(x , y , z);
//            System.out.println(a.name + a.roll + a.marks);
//
//        }






    }
}

// Create a class

class  Student{
    String name;
    int roll;
    int marks;

    public Student() {

    }

    // change the value of name
    public  void changename(String newname)
    {
        name = newname;
    }


    public void greeting()
    {
        System.out.println("Hello World  " + name);
    }


    Student(String name , int roll , int marks )
    {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }



}
