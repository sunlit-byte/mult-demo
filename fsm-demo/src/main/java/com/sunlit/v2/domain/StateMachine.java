package com.sunlit.v2.domain;

/**
 * @author Sunlit
 * @description use an enum for a fsm
 * @date 2023-02-14 23:47
 **/
public enum StateMachine {

    FINISH{
        @Override
        public StateMachine getNext() {
            return this;
        }
    },
    UN_SUBMIT {
        @Override
        public StateMachine getNext() {
            return StateMachine.LEADER_CHECK;
        }
    },
    LEADER_CHECK {
        @Override
        public StateMachine getNext() {
            return StateMachine.HR_CHECK;
        }
    },
    HR_CHECK {
        @Override
        public StateMachine getNext() {
            return StateMachine.FINISH;
        }
    };




    public abstract StateMachine getNext();
}
