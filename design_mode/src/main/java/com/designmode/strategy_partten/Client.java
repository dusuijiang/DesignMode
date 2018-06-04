package com.designmode.strategy_partten;

/**
 * Created by Administrator on 2018/5/21.
 */

public class Client {
    public static void main(String[] args) {
        Strategy strategy = new LargeCustomerStrategy();

        Price price = new Price(strategy);

        double quote = price.quote(10000);
        System.out.println(" 向客户报价  : " +quote);
    }

}
