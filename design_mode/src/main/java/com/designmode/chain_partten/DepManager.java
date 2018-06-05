package com.designmode.chain_partten;

/**
 *部门经理处理
 */

public class DepManager extends Handler {
    @Override
    public String handlerReqpest(String user, double free) {
        String str = "";
        if (free < 1000){
            if (user.equals("小李")){
                str = "部门经理同意"+user+"聚餐费用" +free+"元的请求";
            }else {
                str = "部门经理不同意"+user+"聚餐费用" +free+"元的请求";
            }
        }else {
            if (this.handler != null){
                return handler.handlerReqpest(user,free);
            }
        }
        return str;
    }
}
