package com.designmode.state_pattern.state_1;

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
     * 对应当前每个用户对应的状态处理对象，每个用户当前的状态是不同的
     * <用户名称，当前对应的状态处理对象>
     */
    private Map<String,VoteState> mapState = new HashMap<>();
    /**
     * 记录投票结果 <用户名称，投票的选项>
     */
    private Map<String,String> mapVote = new HashMap<String, String>();

    /**
     * 记录投票次数 <用户名称，投票的次数>
     */
    private Map<String,Integer> mapVoteCount = new HashMap<>();

    /**
     * 获取记录每个用户对应的状态处理对象的map
     * @return
     */
    public Map<String,VoteState> getMapState(){
        return mapState;
    }

    /**
     * 获取投票次数
     */
    public Map<String, Integer> getMapVoteCount() {
        return mapVoteCount;
    }

    /**
     * 获取记录用户投票结果的map
     * @return
     */
    public Map<String,String> getMapVote(){
        return mapVote;
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

       //然后转调对象来进行相应的操作
        VoteState state = mapState.get(user);
        if (state == null){
            state = new NormalVoteState();
        }
       state.vote(user,voteItem,this);
    }
}
