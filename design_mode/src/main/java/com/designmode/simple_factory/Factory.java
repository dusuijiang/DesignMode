package com.designmode.simple_factory;

/**
 * Created by Administrator on 2018/5/21.
 */

public class Factory {

    public static Api createApi(int op){
        Api api = null;
        if (op == 1){
            api = new ImplA();
        }else if(op == 2){
            api = new ImplB();
        }
        return api;
    }
}
