package com.designmode.bridge_pattern;

/**
 * 抽象的消息对象
 */

public abstract class AbstractMessage {
    protected MessageImplementor impl;

    public AbstractMessage(MessageImplementor impl){
        this.impl = impl;
    }

    public void sendMessage(String message,String toUser){
        if (impl != null){
            this.impl.send(message,toUser);
        }
    }
}
