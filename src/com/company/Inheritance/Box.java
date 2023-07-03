package com.company.Inheritance;

 class Box {

    int l;
    int w;
    int  h;

    Box()
    {
        this.l = 1;
        this.h = 2;
        this.w = 3;
    }

    public Box(int side)
    {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    public Box(int l , int w, int h)
    {
        this.w = w;
        this.l = l;
        this.h = h;
    }
}

