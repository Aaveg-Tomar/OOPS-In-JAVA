package Abstraction;

public class Main {
    public static void main(String[] args) {
        Parent sn = new Son(20);

        sn.career();
        sn.partner();

        Daughter dn = new Daughter(20);
        dn.career();
        dn.partner();

//        Parent pr = new Parent()   we cannot create  object of abstract class

        Parent.abc();
    }
}
