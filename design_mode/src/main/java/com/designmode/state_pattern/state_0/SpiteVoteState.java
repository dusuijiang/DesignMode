package com.designmode.state_pattern.state_0;

/**
 * 恶意投票
 */

public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        /**
         * 恶意投票
         * 取消用户的投票资格，并取消投票记录
         */
        String s = voteManager.getMapVote().get(user);
        if (s != null){
            voteManager.getMapVote().remove(user);
        }
        System.out.println(user+ " 你有恶意投票行为，取消投票资格 " + voteItem);
    }
}
