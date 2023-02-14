package com.sunlit.v4.domain;

import com.sunlit.v4.service.IStateHandle;

/**
 * @author Sunlit
 * @description
 * @date 2023-02-15 1:14
 **/
public class SopExec {

    private  State nextState;

    private IStateHandle stateHandle;

    public State getNextState() {
        return nextState;
    }

    public void setNextState(State nextState) {
        this.nextState = nextState;
    }

    public IStateHandle getStateHandle() {
        return stateHandle;
    }

    public void setStateHandle(IStateHandle stateHandle) {
        this.stateHandle = stateHandle;
    }
}
