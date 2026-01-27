package org.java.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GreetingService greeting = (name) -> System.out.println("Hello : " + name + "!");
        greeting.sayHello("Chitresh");
    }
}