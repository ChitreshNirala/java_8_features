package org.java.example;

import java.util.List;


// Flattening a Stream of Collections using flatMap()
public class FlatMapExample {
    public static void main(String[] args) {

        List<List<String>> lists = List.of(List.of("A", "B"), List.of("C", "D"));
                System.out.println(lists);


        lists.stream().flatMap(list -> list.stream())
                .forEach(System.out::println); // A, B, C, D

    }


}
