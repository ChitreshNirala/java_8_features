package org.java.example;

// Skipping Elements in a Stream using skip()
public class SkipExample {
    public static void main(String[] args) {

        java.util.stream.Stream.of("Apple", "Banana", "Cherry", "Date", "Elderberry")
                .skip(2)
                .forEach(System.out::println); // Cherry, Date, Elderberry
    }
}
