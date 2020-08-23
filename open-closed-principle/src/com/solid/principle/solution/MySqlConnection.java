package com.solid.principle.solution;

public class MySqlConnection extends ConnectionBase {
    @Override
    public void doConnect() {
        System.out.println("Connected to MySQL Server");
    }
}
