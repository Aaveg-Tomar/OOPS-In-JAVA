package com.company.staticExample;

public class Main {
    public static void main(String[] args) {
        Human hm1 = new Human(22 , "Kunal" , 10000 , false);
        Human hm2 = new Human(24 , "Rahul" , 20000 , true);

        System.out.println(hm1.population);
        System.out.println(hm2.population);

    }
}
