package com.sunlit.v4.domain;

import com.sunlit.v4.service.IStateHandle;

/**
 * @author Sunlit
 * @description
 * @date 2023-02-15 0:58
 **/
public class SopProcess {

    private State from;
    private State to;
    private Event event;
    private IStateHandle stateHandle;

    public State getFrom() {
        return from;
    }

    public void setFrom(State from) {
        this.from = from;
    }

    public State getTo() {
        return to;
    }

    public void setTo(State to) {
        this.to = to;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public IStateHandle getStateHandle() {
        return stateHandle;
    }

    public void setStateHandle(IStateHandle stateHandle) {
        this.stateHandle = stateHandle;
    }
}
