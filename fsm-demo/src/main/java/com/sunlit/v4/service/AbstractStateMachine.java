package com.sunlit.v4.service;

import com.google.common.collect.HashBasedTable;
import com.sunlit.v4.domain.Event;
import com.sunlit.v4.domain.SopExec;
import com.sunlit.v4.domain.SopProcess;
import com.sunlit.v4.domain.State;

import java.util.List;

/**
 * @author Sunlit
 * @description
 * @date 2023-02-15 1:16
 **/
public abstract class AbstractStateMachine implements StateMachine{

    protected HashBasedTable<State, Event, SopExec> hashBasedTable = HashBasedTable.create();

    public State getNext(State state, Event event) {
        SopExec result = hashBasedTable.get(state, event);
        if (result == null) {
            throw new IllegalArgumentException("未找到状态");
        }
        return result.getNextState();
    }

    public IStateHandle getHandle(State state, Event event) {
        SopExec result = hashBasedTable.get(state, event);
        if (result == null) {
            throw new IllegalArgumentException("未找到状态");
        }
        return result.getStateHandle();
    }

}
