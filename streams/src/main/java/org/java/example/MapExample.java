package org.java.example;

import java.util.List;

// Transforming Stream Elements using map()
public class MapExample {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        nums.stream()
                .map(n -> n * n)
                .forEach(System.out::println); // 1, 4, 9, 16, 25

    }
}
