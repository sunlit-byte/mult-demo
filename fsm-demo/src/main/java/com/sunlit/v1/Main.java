package com.sunlit.v1;

import com.sunlit.v1.Interface.impl.RainStateImpl;
import com.sunlit.v1.domain.State;
import com.sunlit.v1.domain.Worker;

/**
 * @author Sunlit
 * @date 2023-02-14 22:52
 **/
public class Main {

    /**
     * @description:
     * @author: Sunlit
     * @date:  22:52
     * @param: args void
     **/
    public static void main(String[] args) {

        Worker worker = new Worker();
        worker.setName("Sunlit");
        worker.setState(State.RAIN);
        worker.setHandle(new RainStateImpl());
        worker.doSomething();

    }
}
