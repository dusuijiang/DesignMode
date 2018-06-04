package com.designmode.state_pattern.state_0;

/**
 * 状态模式 在上下文中统一维护
 *
 * 如果状态转换的规则是一定的，一般不需要进行什么拓展规则，
 * 那么就适合在上下文中统一的进行状态的维护
 */

public class Client {
    public static void main(String[] args) {
        VoteManager voteManager = new VoteManager();

        for (int i = 0; i <8 ; i++) {
            voteManager.vote("u0","A");
        }
    }

}
