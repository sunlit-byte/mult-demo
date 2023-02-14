package com.sunlit.v4.service;

import com.sunlit.v4.domain.Event;
import com.sunlit.v4.domain.SopProcess;
import com.sunlit.v4.domain.State;

import java.util.List;

/**
 * @author Sunlit
 * @description
 * @date 2023-02-15 1:05
 **/
public interface StateMachine {



    public List<SopProcess> init();


    public State getNext(State state, Event event);

    public IStateHandle getHandle(State state,Event event);

}
