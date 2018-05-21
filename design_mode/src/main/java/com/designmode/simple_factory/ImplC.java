package com.designmode.simple_factory;

/**
 * Created by Administrator on 2018/5/21.
 */

public class ImplC implements Api {
    @Override
    public void operation(String s) {
        System.out.println(" ImplC : " +s);
    }
}
