package com.solid.principle;

import com.solid.principle.solution.*;

public class Main {

    public static void main(String[] args) {

        // Solution
        IReader reader = new KeyBoard();
        IWriter writer = new Database();
        Copy copy = new Copy(reader, writer);
    }
}
