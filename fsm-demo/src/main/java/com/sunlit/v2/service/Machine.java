package com.sunlit.v2.service;

import com.sunlit.v2.domain.State;

/**
 * @author Sunlit
 * @description
 * @date 2023-02-14 23:32
 **/
public class Machine {

    private State state;

    public static State getNext(State state){
        if(state == State.UN_SUBMIT){
            return State.LEADER_CHECK;
        }else if(state == State.LEADER_CHECK){
            return State.HR_CHECK;
        } else if (state == State.HR_CHECK) {
            return State.FINISH;
        }
        throw new IllegalArgumentException("非法操作");
    }
}
