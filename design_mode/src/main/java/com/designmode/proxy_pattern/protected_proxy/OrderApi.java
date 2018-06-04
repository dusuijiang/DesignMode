package com.designmode.proxy_pattern.protected_proxy;

/**
 * Created by Administrator on 2018/5/23.
 */

public interface OrderApi {
    /**
     * 获取订单名称
     * @return
     */
    String getProductName();

    /**
     * 设置订单名称
     * @param productName 订单名称
     * @param user 操作员
     */
    void setProductName(String productName,String user);

    /**
     * 获取订单数量
     * @return
     */
    int getOrderNum();

    /**
     * 设置订单数量
     * @param orderNum 订单数量
     * @param user 操作员
     */
    void setOrderNum(int orderNum,String user);

    /**
     * 获取订单创建人
     * @return
     */
    String getOrderName();

    /**
     * 设置订单创建人
     * @param orderUser 订单创建人
     * @param user 操作员
     */
    void setOrderName(String orderUser,String user);
}
