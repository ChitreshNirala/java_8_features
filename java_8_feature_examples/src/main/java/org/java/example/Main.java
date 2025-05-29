package org.java.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Traditional way using anonymous class
        Runnable oldWay = new Runnable() {
            public void run() {
                System.out.println("Hello from old way!");
            }
        };
        oldWay.run();

        // Using lambda expression
        Runnable lambdaWay = () -> System.out.println("Hello from lambda!");
        lambdaWay.run();
    }




}