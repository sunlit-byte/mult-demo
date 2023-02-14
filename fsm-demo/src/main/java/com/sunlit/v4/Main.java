package com.sunlit.v4;

import com.sunlit.v4.domain.Event;
import com.sunlit.v4.domain.State;
import com.sunlit.v4.service.IStateHandle;
import com.sunlit.v4.service.impl.NewStateMachine;

/**
 * @author Sunlit
 * @description
 * @date 2023-02-15 1:28
 **/
public class Main {


    public static void main(String[] args) {
        NewStateMachine stateMachine = new NewStateMachine();
        State state = stateMachine.getNext(State.LEADER_CHECK, Event.PASS);
        System.out.println(state);
        IStateHandle<String, String> stateHandle = stateMachine.getHandle(State.LEADER_CHECK, Event.PASS);
        String result = stateHandle.handle("入参内容");
        System.out.println(result);
    }

}
