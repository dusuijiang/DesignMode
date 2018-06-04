package com.designmode.state_pattern.state_1;

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
        //重复投票完成，维护下一个状态，重复投票到5，就算恶意投票了
        if (voteManager.getMapVoteCount().get(user) >= 4){
            voteManager.getMapState().put(user,new SpiteVoteState());
        }
    }
}
