package com.sunlit.v1.Interface.impl;

import com.sunlit.v1.Interface.IState;

/**
 * @author Sunlit
 * @description
 * @date 2023-02-14 23:02
 **/
public class ThursdayState implements IState {
    /**
     * @description: 状态对应的事件处理函数
     * @author: Sunlit
     * @date: 2023/2/14 22:59  void
     **/
    @Override
    public void handle() {
        System.out.println("today is thursday");
    }
}
