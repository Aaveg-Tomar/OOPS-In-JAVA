package com.company.staticExample;

public class InnerClass {  // outside cannot be static
    static class Test{
        String name;

        public  Test(String name)
        {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}

//class Test {
//    static String name;
//
//    public Test(String name) {
//        Test.name = name;
//    }
//
//}  //output will be Rahul Rahul;



