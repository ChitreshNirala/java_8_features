package org.java.example;

import static java.util.Arrays.stream;

// Using reduce to sum all elements of an array
public class ReduceExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};


        int sum = stream(numbers)
                .reduce(0, (a, b) -> a + b);   //or .reduce(0, Integer::sum);

        System.out.println("Sum of all elements: " + sum);
    }
}
