package org.java.example;

import java.util.Comparator;
import java.util.List;

// Sorting a Stream using sorted()
public class SortedExample {
    public static void main(String[] args) {
        List<Integer> integers = List.of(12, 5, 3, 1, 4);

        integers.stream()
                .sorted()
                .forEach(System.out::println); // 1, 3, 4, 5, 12


        //custom sorting
        System.out.println("Custom Sorting:");
        integers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println); // 12, 5, 4, 3, 1
    }
}
