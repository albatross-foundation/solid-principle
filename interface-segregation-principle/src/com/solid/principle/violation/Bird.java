package com.solid.principle.violation;

public class Bird implements Animal {
    @Override
    public void fly() {
        System.out.println("Bird is flying !!!");
    }

    @Override
    public void run() {
        System.out.println("Bird is running !!!");
    }

    @Override
    public void bark() {

    }
}
