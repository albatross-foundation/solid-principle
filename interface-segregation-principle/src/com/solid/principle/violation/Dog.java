package com.solid.principle.violation;

public class Dog implements Animal {
    @Override
    public void fly() {

    }

    @Override
    public void run() {
        System.out.println("Dog is running !!!");
    }

    @Override
    public void bark() {
        System.out.println("Dog is barking !!!");
    }
}
