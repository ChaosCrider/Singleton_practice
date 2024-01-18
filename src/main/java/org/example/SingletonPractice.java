package org.example;

public class SingletonPractice {

    private static SingletonPractice instance;
    private SingletonPractice(){
        System.out.println("singleton generated");
    }

    public static SingletonPractice getInstance(){
        if( instance == null) { return instance = new SingletonPractice(); }
        return instance;
    }

    public String getMsg()
    {
        return "Test completed";
    }

}
