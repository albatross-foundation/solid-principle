package com.solid.principle.solution;

public class Bird implements Flyable, Runnable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void run() {
        System.out.println("Bird is running");
    }
}
