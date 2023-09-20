package com.example.www_lab2;

import com.example.www_lab2.db.Connection;

public class Main {
    public static void main(String[] args) {
        Connection.getInstance().getSessionFactory();
    }
}
