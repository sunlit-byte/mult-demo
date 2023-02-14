package com.sunlit.v3;

import com.sunlit.v3.domain.Event;
import com.sunlit.v3.domain.State;
import com.sunlit.v3.service.Machine;

/**
 * @author Sunlit
 * @description
 * @date 2023-02-15 0:27
 **/
public class Main {

    public static void main(String[] args) {
        System.out.println(Machine.getNext(State.LEADER_CHECK, Event.PASS));
    }
}
