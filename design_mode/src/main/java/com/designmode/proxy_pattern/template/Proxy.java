package com.designmode.proxy_pattern.template;

/**
 * 代理对象
 */

public class Proxy implements Subject{

    private RealSubject realSubject = null;

    /**
     *
     * @param realSubject 被代理具体的目标对象
     */
    public Proxy(RealSubject realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        //代理前做一些具体逻辑

        realSubject.request();

        //代理后做一些具体逻辑
    }
}
