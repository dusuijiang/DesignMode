package com.designmode.simple_factory;


/**
 * 简单工厂.
 */

public class Client {
    public static void main(String[] args){
        Api api = Factory.createApi(1);
        api.operation("简单工厂模式");

        Api apia = FactoryPlus.createApi("ImplClassA");
        apia.operation("使用配置文件的简单工厂模式");

        Api apib = FactoryPlus.createApi("ImplClassB");
        apib.operation("使用配置文件的简单工厂模式");

        Api apic = FactoryPlus.createApi("ImplClassC");
        apic.operation("使用配置文件的简单工厂模式");
    }
}
