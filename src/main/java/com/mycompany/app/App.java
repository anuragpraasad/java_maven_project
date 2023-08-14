package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "This is a Java app built with Maven Automated with Jenkins !!!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
