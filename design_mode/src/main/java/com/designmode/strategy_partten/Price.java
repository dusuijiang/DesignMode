package com.designmode.strategy_partten;

/**
 * 上下文对象，通常会持有一个具体的策略对象
 */

public class Price {

    private Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 上下文对客户端的操作接口
     */
    public double quote(double price){
        return strategy.calcPrice(price);
    }
}
