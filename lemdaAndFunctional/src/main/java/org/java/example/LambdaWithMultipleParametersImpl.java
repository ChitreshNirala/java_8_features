package org.java.example;


//It is not mandatory to use parentheses
// if the type of that variable can be inferred from the context.

import org.java.example.interfc.LamdaWithMultipleParameters;

import java.util.ArrayList;

public class LambdaWithMultipleParametersImpl {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("All Elements:");
        list.forEach(System.out::println);

        System.out.println("Even Elements:");
        list.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });


        LamdaWithMultipleParameters addition = (a, b) -> a + b;
        LamdaWithMultipleParameters multiplication = (a, b) -> a * b;
        System.out.println("Addition: " + addition.operation(5, 10));
        System.out.println("Multiplication: " + multiplication.operation(5, 10));

    }
}

