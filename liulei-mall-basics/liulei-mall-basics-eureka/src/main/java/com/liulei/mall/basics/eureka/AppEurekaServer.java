package com.liulei.mall.basics.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
* @Description:    Eureka注册中心启动类
* @Author:         liulei
* @CreateDate:     2019/1/6 下午3:10
* @Version:        1.0
*/
@EnableEurekaServer
@SpringBootApplication
public class AppEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(AppEurekaServer.class,args);
        System.out.println("Eureka注册中心启动成功！！！");
    }
}
