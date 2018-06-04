package com.designmode.state_pattern.state_1;

/**
 * 状态模式
 *
 * 如果状态的转换取决于前一个状态处理的结果，或者是依赖于外部数据，
 * 为了增强灵活性，在这种情况下，一般是在状态处理类中进行状态的维护
 */

public class Client {
    public static void main(String[] args) {
        VoteManager voteManager = new VoteManager();

        for (int i = 0; i <8 ; i++) {
            voteManager.vote("u1","B");
        }
    }

}
