package com.designmode.proxy_pattern.protected_proxy;

/**
 * 订单
 */

public class Order implements OrderApi{

    //订单名称
    private String productName;
    //订单数量
    private int orderNum;
    //创建订单的人员
    private String orderUser;

    public Order(String productName, int orderNum, String orderUser) {
        this.productName = productName;
        this.orderNum = orderNum;
        this.orderUser = orderUser;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName, String user) {
        this.productName = productName;
    }

    @Override
    public int getOrderNum() {
        return orderNum;
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        this.orderNum = orderNum;
    }

    @Override
    public String getOrderName() {
        return orderUser;
    }

    @Override
    public void setOrderName(String orderUser, String user) {
        this.orderUser = orderUser;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", orderNum=" + orderNum +
                ", orderUser='" + orderUser + '\'' +
                '}';
    }
}
