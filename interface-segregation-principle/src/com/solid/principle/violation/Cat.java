package com.solid.principle.violation;

public class Cat implements Animal {
    @Override
    public void fly() {

    }

    @Override
    public void run() {
        System.out.println("Cat is running !!!");
    }

    @Override
    public void bark() {

    }
}
