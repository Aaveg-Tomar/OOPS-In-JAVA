package com.company.staticExample;

public class Main {
    public static void main(String[] args) {
        Human hm1 = new Human(22 , "Kunal" , 10000 , false);
        Human hm2 = new Human(24 , "Rahul" , 20000 , true);
        Human hm3 = new Human(25 , "arpit" , 3000 , true);

        System.out.println(Human.population);
        System.out.println(hm2.population);
        System.out.println(Human.population);

    }
}
