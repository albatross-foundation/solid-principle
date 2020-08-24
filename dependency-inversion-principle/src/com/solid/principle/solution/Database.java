package com.solid.principle.solution;

public class Database implements IWriter, IReader {
    @Override
    public String read() {
        return "Reading from database";
    }

    @Override
    public void write(String input) {
        System.out.println("Writing to database");
    }
}
