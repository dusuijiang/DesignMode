package com.designmode.bridge_pattern;

/**
 * 加急消息
 */

public class SpecialMessage extends AbstractMessage {
    public SpecialMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "特急 ：" +message;
        super.sendMessage(message, toUser);
    }

    public void harray(String messageId){
        //执行催促的业务，发出催促的消息

    }
}
