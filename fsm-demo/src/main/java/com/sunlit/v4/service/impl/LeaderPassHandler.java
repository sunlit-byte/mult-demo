package com.sunlit.v4.service.impl;

import com.sunlit.v4.service.IStateHandle;

/**
 * @author Sunlit
 * @description leader pass handler
 * @date 2023-02-15 0:55
 **/
public class LeaderPassHandler implements IStateHandle<String,String> {
    @Override
    public String handle(String s) {
        System.out.println(String.format("get %s",s));
        return "业务处理完了";
    }
}
