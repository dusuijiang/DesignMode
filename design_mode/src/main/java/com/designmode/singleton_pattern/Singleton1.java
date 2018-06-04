package com.designmode.singleton_pattern;

/**
 * 饿汉式
 */

public class Singleton1 {
    private static  Singleton1 singleton1 = new Singleton1();

    private Singleton1(){

    }

    public static Singleton1 getSingleton1(){
        return singleton1;
    }
}
