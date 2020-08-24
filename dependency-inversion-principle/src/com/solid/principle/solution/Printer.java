package com.solid.principle.solution;

public class Printer implements IWriter {
    @Override
    public void write(String input) {
        System.out.println("Writing from printer " + input);
    }
}
