package com.ajk.helloserver.impl;

import com.ajk.api.HelloService;
import com.ajk.entity.User;
import com.geekbing.RpcService;

/**
 * RPC接口的实现类
 *
 * @author bing
 */
@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {
    /**
     * 直接将输入的字符串前面加上 Hello字符串
     *
     * @param name 字符串类型
     * @return 字符串类型
     */
    @Override
    public String say(String name) {
        return "Hello " + name;
    }

    @Override
    public User getUserById(Long id) {
        return new User(id, "User-" + id, "Password-" + id);
    }
}
