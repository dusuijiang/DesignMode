package com.designmode.state_pattern.state_0;

/**
 * 黑名单
 */

public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        /**
         * 黑名单
         * 记录黑名单中，禁止登陆系统了
         */
        System.out.println(user+ " 进入黑名单，禁止登陆系统 " + voteItem);
    }
}
