package com.designmode.bridge_pattern;

/**
 * 桥接模式
 */

public class Client {
    public static void main(String[] args) {

        //使用站内短消息
        MessageImplementor impl = new MessageSMS();
        //创建一个普通消息
        AbstractMessage m = new CommonMessage(impl);
        m.sendMessage("请喝一杯茶","小李");

        //创建一个紧急消息
        m = new UrgencyMessage(impl);
        m.sendMessage("请喝一杯茶","小李");

        //创建一个特急消息
        m = new SpecialMessage(impl);
        m.sendMessage("请喝一杯茶","小李");


        //使用E-mail的方式发送消息
        MessageImplementor impls = new MessageEmail();
        //创建一个普通消息
        AbstractMessage ms = new CommonMessage(impls);
        ms.sendMessage("请喝一杯茶","小李");

        //创建一个紧急消息
        ms = new UrgencyMessage(impls);
        ms.sendMessage("请喝一杯茶","小李");

        //创建一个特急消息
        ms = new SpecialMessage(impls);
        ms.sendMessage("请喝一杯茶","小李");

    }

}
