package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Student kunal = new Student("Aaveg" , 1 , 90 );
        Student[] std = new Student[5];

        for (int i = 0; i < 5; i++) {
            String x = in.next();
            int y = in.nextInt();
            int z = in.nextInt();

           Student a =  new Student(x , y , z);
            System.out.println(a.name + a.roll + a.marks);

        }




    }
}

// Create a class

class  Student{
    String name;
    int roll;
    int marks;


    Student(String name , int roll , int marks )
    {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

}
