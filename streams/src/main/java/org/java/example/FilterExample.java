package org.java.example;

import java.util.List;


// Filtering a Stream using filter()
public class FilterExample {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        nums.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println); // 2, 4

    }
}