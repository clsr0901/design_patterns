package com.design.patterns.state.test3;


/**
 *
 * @author chenliangsen
 * @date 2019/12/31 14:26
 */
public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //正常投票
        //记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜你投票成功");
    }
}
