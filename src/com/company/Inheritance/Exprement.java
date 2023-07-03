package com.company.Inheritance;

public class Exprement {
    public static void main(String[] args) {

        Erp ex = new Erp();
        System.out.println( ex.x + " " + ex.y + " " +  ex.w);


        Erp ex1 = new Erp(1 , 2 , 4 );
        System.out.println(ex1.x + " " + ex1.y + " " + ex1.w);

        ex.xyz();


    }
}

class Exp{
    int x;
    int y;

    // private not access by the other class it can only access in the class
    private  int z;

    Exp()
    {
        this.x = -1;
        this.y = -5;
        this.z = 0;
    }

    Exp(int x , int y )
    {
        this.x = x;
        this.y = y;
    }

    Exp(int x , int y , int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void xyz()
    {
        Exp ar = new Exp(1 , 2 , 3);
        System.out.println(ar.x + " " + ar.y + " " + ar.z);
    }

}

class Erp extends Exp{
    int w;

    Erp()
    {
        this.w = -9;
    }

    Erp(int x , int y , int w)
    {
        super(x, y );
        this.w = w;
    }
}
