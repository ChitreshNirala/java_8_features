package org.java.example;

import java.util.stream.Stream;

// Limiting the Number of Elements in a Stream using limit()
public class LimitExample {

    public static void main(String[] args) {
        Stream.of("Apple", "Banana", "Cherry", "Date", "Elderberry")
                .limit(3)
                .forEach(System.out::println); // Apple, Banana, Cherry
    }
}
