package com.designmode.strategy_partten;

/**
 * 大客户具体算法
 */

public class LargeCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println(" 对于大客户，统一折扣10%");
        return goodsPrice * (1 - 0.1);
    }
}
