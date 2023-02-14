package com.sunlit.v2;

import com.sunlit.v2.domain.State;
import com.sunlit.v2.domain.StateMachine;
import com.sunlit.v2.service.Machine;

/**
 * @author Sunlit
 * @description
 * @date 2023-02-14 23:42
 **/
public class Main {

    public static void main(String[] args) {


        State state = State.UN_SUBMIT;
        System.out.println("next state is " + Machine.getNext(state).toString());

//        the second method to develop a msf
        StateMachine stateMachine = StateMachine.UN_SUBMIT;
        System.out.println(stateMachine.getNext());
    }
}
