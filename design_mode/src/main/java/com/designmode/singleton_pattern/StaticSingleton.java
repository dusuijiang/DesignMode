package com.designmode.singleton_pattern;

/**
 * 静态内部内
 */

public class StaticSingleton {
    private String name;
    private StaticSingleton(){

    }

    public static StaticSingleton getStaticSingleton(){
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder{
        private static StaticSingleton INSTANCE = new StaticSingleton();
    }
}
