package com.ajk.api;

import com.ajk.entity.User;

/**
 * RPC接口
 *
 * @author bing
 */
public interface HelloService {
    /**
     * 简单的RPC接口测试方法
     *
     * @param name 字符串类型
     * @return 返回字符串
     */
    String say(String name);

    /**
     * 根据用户ID查询用户
     *
     * @param id 　用户ID
     * @return 用户
     */
    User getUserById(Long id);
}
