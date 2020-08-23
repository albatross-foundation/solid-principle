package com.solid.principle.violation;

public class ConnectionManager {
    public void doConnectToSqlServer(SqlServerConnection connection) {
        connection.doConnect();
    }

    public void doConnectToMySqlServer(MySqlConnection connection) {
        connection.doConnect();
    }
}
