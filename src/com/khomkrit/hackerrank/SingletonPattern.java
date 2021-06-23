package com.khomkrit.hackerrank;

import java.util.Scanner;

class Singleton {
    private static Singleton singleInstance = null;
    public String str;
    private Singleton(){
        str = "Hello I am a singleton!";
    }
    public static Singleton getSingleInstance (){
        if(singleInstance==null){
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        scanner.close();
        Singleton singleton = Singleton.getSingleInstance();
        System.out.println(singleton.str+" Let me say "+words+" to you");

    }
}
