package com.designmode.state_pattern.state_0;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/6/4.
 */

class VoteManager {

    /**
     * 持有状态处理对象
     */
    private VoteState state = null;

    /**
     * 记录投票结果 <用户名称，投票的选项>
     */
    private Map<String,String> mapVote = new HashMap<String, String>();

    /**
     * 记录投票次数 <用户名称，投票的次数>
     */
    private Map<String,Integer> mapVoteCount = new HashMap<>();

    /**
     * 获取记录用户投票结果的map
     * @return
     */
    public Map<String,String> getMapVote(){
        return mapVote;
    }
    /**
     * 获取投票次数
     */
    public Map<String, Integer> getMapVoteCount() {
        return mapVoteCount;
    }
    /**
     * 投票
     * @param user 投票人
     * @param voteItem 投票选项
     */
    public void vote(String user,String voteItem){
        //1. 先为该用户增加投票的次数
        //从记录中取出已有的投票次数
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null){
            oldVoteCount = 0;
        }

        oldVoteCount = oldVoteCount + 1;
        mapVoteCount.put(user,oldVoteCount);

        //2. 判断该用户的投票类型

       if (oldVoteCount >= 8){
           state = new BlackVoteState();
       }else if (oldVoteCount >= 5){
           state = new SpiteVoteState();
       }else if (oldVoteCount > 1){
           state = new RepeatVoteState();
       }else {
           state = new NormalVoteState();
       }

       //然后转调对象来进行相应的操作
       state.vote(user,voteItem,this);
    }
}
