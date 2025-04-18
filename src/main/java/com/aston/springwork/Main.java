package com.aston.springwork;

import org.aston.CustomLogger;

public class Main {
    public static void main(String[] args) {
        CustomLogger logger = new CustomLogger();
        logger.log("Привет, это мой первый лог!");
        logger.log("Стартер работает!");
    }
}
