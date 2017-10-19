package com.ajk.helloserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务端启动类
 *
 * @author bing
 */
@SpringBootApplication(scanBasePackages = {"com.geekbing", "com.ajk"})
public class HelloServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloServerApplication.class, args);
    }
}
