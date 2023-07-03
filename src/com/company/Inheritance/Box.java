package com.company.Inheritance;

 class Box {

    int l;
    int w;
    int h;

    Box()
    {
        this.l = 1;
        this.w = 2;
        this.h = 3;
    }

    public Box(int side)
    {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Box(int l , int w, int h)
    {
        this.l = l;
        this.w = w;
        this.h = h;
    }
}

