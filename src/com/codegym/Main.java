package com.codegym;

public class Main {

    public static void main(String[] args) {
        DBConnection dbConnection = new MySQLConnection();
        DBConfig dbConfig = new DBConfig(dbConnection);
        dbConfig.showInfo();
        dbConnection = new OracleConnection();
        dbConfig.setDbConnection(dbConnection);
        dbConfig.showInfo();
    }
}
