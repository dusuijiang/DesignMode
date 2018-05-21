package com.designmode.simple_factory;

/**
 * Created by Administrator on 2018/5/21.
 */

public class ImplB implements Api {
    @Override
    public void operation(String s) {
        System.out.println(" ImplB : " +s);
    }
}
