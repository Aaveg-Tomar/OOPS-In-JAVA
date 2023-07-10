package Abstraction;

public class Son extends Parent {

    Son(int age)
    {
        super(age);
//        this.age = age;
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career()
    {
        System.out.println("name");

    }
    @Override
    void partner()
    {
        System.out.println("ms marvel");

    }
}
