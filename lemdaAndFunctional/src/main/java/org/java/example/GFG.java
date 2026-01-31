package org.java.example;


import org.java.example.interfc.Add;
import org.java.example.interfc.LamdaWithZeroParameters;

public class GFG {
    public static void main(String[] args) {


        Add obj = (a, b) -> System.out.println("The sum is: " + (a + b));
        obj.addition(5, 10);

        // Lambda with Zero Parameters
        LamdaWithZeroParameters obj1 = () -> System.out.println("Hello, this is a lambda expression with zero parameters!");
        obj1.display();
    }
}