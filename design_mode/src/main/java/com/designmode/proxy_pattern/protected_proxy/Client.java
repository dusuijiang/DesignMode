package com.designmode.proxy_pattern.protected_proxy;

/**
 * Created by Administrator on 2018/5/21.
 */

public class Client {
    public static void main(String[] args){
        //静态代理
//        OrderApi orderApi = new OrderProxy(new Order("设计模式",100,"张三"));
//
//        orderApi.setOrderNum(123,"李四");
//        System.out.println(" 李四修改订单  : "  + orderApi);
//        orderApi.setOrderNum(10000,"张三");
//        System.out.println(" 张三修改订单 : "  + orderApi);

        //动态代理
        Order order = new Order("设计模式",100,"张三");
        System.out.println(" 修改前订单 : "  + order);
        DynamicProxy dynamicProxy = new DynamicProxy();
        OrderApi orderApi = dynamicProxy.getProxyInterface(order);
        orderApi.setOrderNum(10000,"李四");
        System.out.println(" 李四修改订单  : "  + orderApi);
        orderApi.setOrderNum(10000,"张三");
        System.out.println(" 张三修改订单  : "  + orderApi);
    }
}
