package com.designmode.proxy_pattern.protected_proxy;

/**
 * 订单代理对象
 */

public class OrderProxy implements OrderApi{

    private Order order;

    public OrderProxy(Order order) {
        this.order = order;
    }

    @Override
    public String getProductName() {
        return this.order.getProductName();
    }

    @Override
    public void setProductName(String productName, String user) {
        //只有订单创建人才可以修改订单
        if (user != null && user.equals(this.getOrderName())){
            order.setProductName(productName,user);
        }else {
            System.out.println("订单创建人为 : "+this.getOrderName()+","+user+"无权修改!" );
        }
    }

    @Override
    public int getOrderNum() {
        return this.order.getOrderNum();
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        //只有订单创建人才可以修改订单
        if (user != null && user.equals(this.getOrderName())){
            order.setOrderNum(orderNum,user);
        }else {
            System.out.println("订单创建人为 : "+this.getOrderName()+","+user+"无权修改!" );
        }
    }

    @Override
    public String getOrderName() {
        return this.order.getOrderName();
    }

    @Override
    public void setOrderName(String orderUser, String user) {
        //只有订单创建人才可以修改订单
        if (user != null && user.equals(this.getOrderName())){
            order.setOrderName(orderUser,user);
        }else {
            System.out.println("订单创建人为 : "+this.getOrderName()+","+user+"无权修改!" );
        }
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
