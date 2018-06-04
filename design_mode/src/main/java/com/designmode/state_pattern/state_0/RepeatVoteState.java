package com.designmode.state_pattern.state_0;

/**
 * 重复投票
 */

public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        /**
         * 重复投票
         * 暂时不做处理
         */
        System.out.println(user+ " 请不要重复投票 " + voteItem);
    }
}
