package com.company.Inheritance;


// It takes all the properties of the Box
public class BoxWeight extends Box {

    double weight;

    BoxWeight()
    {
        this.weight = -1;
    }

    BoxWeight(int l , int w , int h , double weight)
    {
        super(l , w, h);    // call the parent class constructor
        this.weight = weight;
    }

}
