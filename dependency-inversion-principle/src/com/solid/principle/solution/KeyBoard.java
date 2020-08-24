package com.solid.principle.solution;

public class KeyBoard implements IReader {
    @Override
    public String read() {
        return "Reading from Keyboard";
    }
}
