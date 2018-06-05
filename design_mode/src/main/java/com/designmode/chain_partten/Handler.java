package com.designmode.chain_partten;

/**
 * 定义职责对象的接口
 */

public abstract class Handler {
    protected Handler handler = null;

    public void setHandler(Handler handler){
        this.handler = handler;
    }

    /**
     * 处理聚餐费用的申请
     * @param user 申请人
     * @param free 申请的钱数
     * @return 成功或失败
     */
    public abstract String handlerReqpest(String user,double free);
}
