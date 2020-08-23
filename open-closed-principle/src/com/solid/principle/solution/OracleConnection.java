package com.solid.principle.solution;

public class OracleConnection extends ConnectionBase {
    @Override
    public void doConnect() {
        System.out.println("Connected to Oracle Server");
    }
}
