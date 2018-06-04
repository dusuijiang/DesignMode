package com.designmode.strategy_partten;

/**
 * 具体算法,为新用户或者普通客户计算应报的价格
 */

public class NormalCustomerStrategy implements Strategy {

    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println(" 对于新用户或者普通客户计算应报的价格，没有折扣");
        return goodsPrice;
    }
}
