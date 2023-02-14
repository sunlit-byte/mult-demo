package com.sunlit.v4.service.impl;

import com.sunlit.v4.domain.*;
import com.sunlit.v4.service.AbstractStateMachine;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sunlit
 * @description
 * @date 2023-02-15 1:21
 **/
public class NewStateMachine extends AbstractStateMachine {
    @Override
    public List<SopProcess> init() {
        return Arrays.asList(
                SopProcessBuilder.getInstance()
                        .from(State.UN_SUBMIT)
                        .event(Event.SUBMIT)
                        .to(State.LEADER_CHECK)
                        .build(),
                SopProcessBuilder.getInstance()
                        .from(State.LEADER_CHECK)
                        .event(Event.PASS)
                        .handle(new LeaderPassHandler())
                        .to(State.HR_CHECK)
                        .build()
        );
    }


    public NewStateMachine(){
        List<SopProcess> sopProcesses = init();
        sopProcesses.forEach(
                item->{
                    SopExec sopExec = new SopExec();
                    sopExec.setNextState(item.getTo());
                    sopExec.setStateHandle(item.getStateHandle());
                    hashBasedTable.put(item.getFrom(),item.getEvent(),sopExec);
                }
        );
    }
}
