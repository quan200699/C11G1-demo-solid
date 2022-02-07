package com.codegym;

public class OracleConnection implements DBConnection{
    @Override
    public void connect() {
        System.out.println("kết nối đến Oracle");
    }
}
