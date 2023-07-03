package com.company.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Square sq = new Square();
        Circle cr = new Circle();
        Triangle tri = new Triangle();

        Shapes sh = new Shapes();
        sh.area();

        Shapes.abc();
        cr.area();



    }
}
