package com.liulei.mall.basics.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
* @Description:    Config配置中心启动类
* @Author:         liulei
* @CreateDate:     2019/1/7 上午9:46
* @Version:        1.0
*/
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AppConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(AppConfigServer.class,args);
        System.out.println("Config配置中心启动成功！！！");
    }
}
