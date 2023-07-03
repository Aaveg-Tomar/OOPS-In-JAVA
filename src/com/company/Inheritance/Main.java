package com.company.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(" Box " + box1.h + " " + box1.l + " " + box1.w);

//        Box box2 = new Box(4);
//        System.out.println(box2.h + " " + box2.l + " " + box2.w);
//
//        Box box3 = new Box(4 , 5 , 8);
//        System.out.println(box3.h + " " + box3.l + " " + box3.w);


        BoxWeight box4 = new BoxWeight();
        System.out.println(" Box Weight " + box4.weight + " Box Weight Heigth " + box4.h);

        BoxWeight box5 = new BoxWeight(2,5 ,7 , 10);

        System.out.println(box5.l + " " + box5.w + " " + box5.weight);

        BoxPrice boxPrice1 = new BoxPrice();
        System.out.println("BoxPrice " + boxPrice1.l + " " + boxPrice1.weight + " " + boxPrice1.price);


        BoxPrice boxPrice = new BoxPrice(20 , 30 , 40 , 10.0 , 90);
        System.out.println("BoxPrice " + boxPrice.l + " " + boxPrice.weight + " " + boxPrice.price);




    }




}

//class Box1 {
//
//    int l;
//    int w;
//    int  h;
//
//    Box1()
//    {
//        this.l = -1;
//        this.h = -1;
//        this.w = -1;
//    }
//
//    public Box1(int side)
//    {
//        this.l = side;
//        this.h = side;
//        this.w = side;
//    }
//
//    public Box1(int l , int w, int h)
//    {
//        this.w = w;
//        this.l = l;
//        this.h = h;
//    }
//}
