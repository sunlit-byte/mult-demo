package com.sunlit.v1.Interface.impl;

import com.sunlit.v1.Interface.IState;

import java.sql.SQLOutput;

/**
 * @author Sunlit
 * @description 雨天状态的行为事件的实现类
 * @date 2023-02-14 23:00
 **/
public class RainStateImpl implements IState {
    /**
     * @description: 状态对应的事件处理函数
     * @author: Sunlit
     * @date: 2023/2/14 22:59  void
     **/
    @Override
    public void handle() {
        System.out.println("今天下雨了");
    }
}
