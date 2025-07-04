package com.example.oop.config;

public class AppConfig {
    private static final AppConfig INSTANCE = new AppConfig();

    private AppConfig() {
        System.out.println("AppConfig initialized");
    }

    public static AppConfig getInstance() {
        return INSTANCE;
    }

    public void printConfig() {
        System.out.println("This is the singleton config");
    }
}
