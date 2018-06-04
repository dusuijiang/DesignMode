package com.designmode.proxy_pattern.protected_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */

public class DynamicProxy implements InvocationHandler {

    private OrderApi order;

    public OrderApi getProxyInterface(Order order){
        this.order = order;

        OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(order.getClass().getClassLoader(),
                order.getClass().getInterfaces(),this);
        return orderApi;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().startsWith("set")){
            if (order.getOrderName() != null && order.getOrderName().equals(args[1]))
               return method.invoke(order,args);
            else
                System.out.println("订单创建人为 : "+this.order.getOrderName()+","+args[1]+"无权修改!" );
        }else {
            return method.invoke(order,args);
        }
        return null;
    }

    @Override
    public String toString() {
        return "OrderProxy{" +
                "productName=" + this.order.getProductName() +
                ", orderNum='" + this.order.getOrderNum() + '\'' +
                ", orderUser='" + this.order.getOrderName() + '\'' +
                '}';
    }
}
