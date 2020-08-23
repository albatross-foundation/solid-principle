package com.solid.principle;

import com.solid.principle.solution.ConnectionManagerSolution;
import com.solid.principle.solution.OracleConnection;
import com.solid.principle.violation.ConnectionManager;
import com.solid.principle.violation.MySqlConnection;
import com.solid.principle.violation.SqlServerConnection;

public class Main {

    public static void main(String[] args) {
        // Violation
        ConnectionManager connectionManager = new ConnectionManager();
        connectionManager.doConnectToMySqlServer(new MySqlConnection());
        connectionManager.doConnectToSqlServer(new SqlServerConnection());

        // Solution
        ConnectionManagerSolution connectionManagerSolution1 = new ConnectionManagerSolution();
        connectionManagerSolution1.doConnect(new com.solid.principle.solution.MySqlConnection());
        connectionManagerSolution1.doConnect(new OracleConnection());
        connectionManagerSolution1.doConnect(new com.solid.principle.solution.MySqlConnection());
    }
}
