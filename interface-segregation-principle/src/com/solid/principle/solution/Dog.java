package com.solid.principle.solution;

public class Dog implements Runnable, Barkable {
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
