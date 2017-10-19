package com.ajk.helloclient;

import com.ajk.api.HelloService;
import com.ajk.entity.User;
import com.geekbing.RpcClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * 客户端启动类
 *
 * @author bing
 */
@SpringBootApplication(scanBasePackages = "com.geekbing")
public class HelloClientApplication {

    private static final int CALL_TIMES = 10;

    @Resource
    private RpcClient rpcClient;

    @PostConstruct
    public void run() {
        long start = System.currentTimeMillis();
        HelloService helloService = rpcClient.create(HelloService.class);
        long end = System.currentTimeMillis();
        System.out.println("创建时间：" + (end - start) + "毫秒");

        for (int i = 0; i < CALL_TIMES; i++) {
            start = System.currentTimeMillis();
            String result = helloService.say("world");
            end = System.currentTimeMillis();
            System.out.println("调用时间: " + (end - start) + "毫秒。调用结果: " + result);
        }

        for (long i = 0; i < CALL_TIMES; i++) {
            start = System.currentTimeMillis();
            User user = helloService.getUserById(i);
            end = System.currentTimeMillis();
            System.out.println("调用时间: " + (end - start) + "毫秒。调用结果: " + user.toString());
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloClientApplication.class, args);
    }
}
