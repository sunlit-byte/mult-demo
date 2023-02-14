package com.sunlit.v3.service;

import com.google.common.collect.HashBasedTable;
import com.sunlit.v3.domain.Event;
import com.sunlit.v3.domain.State;

/**
 * @author Sunlit
 * @description 状态机类
 * @date 2023-02-15 0:18
 **/
public class Machine {

    private static HashBasedTable<State, Event,State> hashBasedTable = HashBasedTable.create();

    static {
        hashBasedTable.put(State.UN_SUBMIT,Event.SUBMIT,State.LEADER_CHECK);
        hashBasedTable.put(State.LEADER_CHECK,Event.PASS,State.HR_CHECK);
        hashBasedTable.put(State.LEADER_CHECK,Event.REJECT,State.REJECT);
        hashBasedTable.put(State.HR_CHECK,Event.PASS,State.FiNASH);
        hashBasedTable.put(State.HR_CHECK,Event.REJECT,State.REJECT);
    }

    public static State getNext(State state, Event event){
        State result = hashBasedTable.get(state,event);
        if(result == null){
            throw new IllegalArgumentException("状态错误");
        }
        return result;
    }
}
