package com.designmode.facade_partten;

/**
 * Created by Administrator on 2018/5/21.
 * 外观模式
 */

public class Facade {

    public void test(){
        AModelApi aModelApi = new AModelImpl();
        aModelApi.testA();

        BModelApi bModelApi = new BModelImpl();
        bModelApi.testB();

        CModelApi cModelApi = new CModelImpl();
        cModelApi.testC();
    }
}
