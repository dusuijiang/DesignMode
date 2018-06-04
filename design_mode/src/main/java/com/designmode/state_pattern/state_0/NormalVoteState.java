package com.designmode.state_pattern.state_0;

/**
 * 正常投票
 */

public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        /**
         * 正常投票记录结果
         */
        voteManager.getMapVote().put(user,voteItem);
        System.out.println(user+ " 投票成功 " + voteItem);
    }
}
