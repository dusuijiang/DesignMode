package com.designmode.facade_partten;


/**
 * 外观模式
 */

public class Client {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.test();
    }
}
