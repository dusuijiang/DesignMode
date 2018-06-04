package com.designmode.singleton_pattern;

/**
 * 双重检查加锁
 */

public class DCLSingleton {
    private volatile static DCLSingleton dclSingleton = null;
    private String name;
    private DCLSingleton(){

    }

    public static DCLSingleton getDclSingleton(){
        if (dclSingleton == null){
            synchronized (DCLSingleton.class){
                if (dclSingleton == null){
                    dclSingleton = new DCLSingleton();
                }
            }
        }
        return dclSingleton;
    }


}
