package com.solid.principle.solution;

public class SqlServerConnection extends ConnectionBase {
    @Override
    public void doConnect() {
        System.out.println("Connected to Sql Server");
    }
}
