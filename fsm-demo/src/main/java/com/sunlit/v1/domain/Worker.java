package com.sunlit.v1.domain;

import com.sunlit.v1.Interface.IState;

/**
 * @author Sunlit
 * @description
 * @date 2023-02-14 23:04
 **/
public class Worker {
    private String name;

    private State state;

    private IState handle;


    public void doSomething(){
        System.out.println("today is " + state.toString());
        handle.handle();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public IState getHandle() {
        return handle;
    }

    public void setHandle(IState handle) {
        this.handle = handle;
    }
}
