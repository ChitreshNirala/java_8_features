package org.java.example;

import java.util.List;

// Removing Duplicates from a Stream using distinct()
public class DistinctExample {
    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 2, 3, 4, 4, 5);

        integers.stream()
                .distinct()
                .forEach(System.out::println); // 1, 2, 3, 4, 5

    }
}
