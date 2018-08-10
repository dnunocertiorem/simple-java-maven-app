package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{
// eliminados comentarios absurdos y añadido este. 
// esta vez es para ver que dice el sonarqube




    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
