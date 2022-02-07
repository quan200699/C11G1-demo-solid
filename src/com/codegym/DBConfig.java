package com.codegym;

public class DBConfig {
    private DBConnection dbConnection;

    public DBConfig(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void showInfo() {
        dbConnection.connect();
    }
}
