package com.sunlit.v4.service;

/**
 * @author Sunlit
 * @description 处理器接口
 * @date 2023-02-15 0:54
 **/
public interface IStateHandle<T, R> {
    R handle(T t);
}
