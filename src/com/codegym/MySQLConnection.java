package com.codegym;

public class MySQLConnection implements DBConnection {
    @Override
    public void connect() {
        System.out.println("Kết nối đến MySQL");
    }
}
