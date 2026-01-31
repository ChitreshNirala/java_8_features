package org.java.example;


import java.util.stream.Stream;

// Peeking into a Stream using peek()
public class PeekExample {
    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4, 5)
                .peek(n -> System.out.println("Original value: " + n))
                .map(n -> n * n)
                .peek(n -> System.out.println("Squared value: " + n))
                .forEach(n -> System.out.println("Final value: " + n));
    }
}
