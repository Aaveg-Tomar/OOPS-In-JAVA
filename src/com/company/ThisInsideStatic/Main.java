package com.company.ThisInsideStatic;

public class Main {
    public static void main(String[] args) {
        Human x = new Human(23 , "kunal" , true);
        Human y = new Human(36  , "g" , false);

        // abc is static function
        Human.abc();


        // calling non-static function
        Human z = new Human();
        z.xyz();




    }
}
