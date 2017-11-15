package com.example;

public class Jokes {

    private static String[] JOKES = {"joke1", "joke2", "joke3"};

    private Jokes() {}

    public static String getJoke() {

        int index = (int) (Math.random() * 10 * JOKES.length) % JOKES.length;

        return JOKES[index];
    }
}
