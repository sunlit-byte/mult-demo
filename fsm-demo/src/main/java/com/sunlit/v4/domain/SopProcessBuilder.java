package com.sunlit.v4.domain;

import com.sunlit.v4.service.IStateHandle;

/**
 * @author Sunlit
 * @description
 * @date 2023-02-15 0:59
 **/
public class SopProcessBuilder {

    private SopProcess sopProcess;

    public void setSopProcess(SopProcess sopProcess){
        this.sopProcess = sopProcess;
    }

    public static SopProcessBuilder getInstance(){
        SopProcessBuilder sopProcessBuilder = new SopProcessBuilder();
        sopProcessBuilder.setSopProcess(new SopProcess());
        return sopProcessBuilder;
    }

    public SopProcessBuilder from(State state){
        sopProcess.setFrom(state);
        return this;
    }

    public SopProcessBuilder handle(IStateHandle stateHandle){
        sopProcess.setStateHandle(stateHandle);
        return this;
    }

    public SopProcessBuilder to(State state){
        sopProcess.setTo(state);
        return this;
    }

    public SopProcessBuilder event(Event event){
        sopProcess.setEvent(event);
        return this;
    }

    public SopProcess build(){
        return this.sopProcess;
    }
}
