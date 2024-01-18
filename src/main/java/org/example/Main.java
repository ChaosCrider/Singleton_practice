package org.example;



public class Main {
    public static void main(String[] args) {

        SingletonPractice singleton;
        singleton = SingletonPractice.getInstance();

        System.out.println(singleton.getMsg());
    }
}