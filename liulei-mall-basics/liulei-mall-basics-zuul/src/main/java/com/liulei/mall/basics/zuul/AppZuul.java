package com.liulei.mall.basics.zuul;


import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
* @Description:    zuul网关服务启动类
* @Author:         liulei
* @CreateDate:     2019/01/06 下午04:15
* @Version:        1.0
*/
@EnableSwagger2Doc
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class AppZuul {
    public static void main(String[] args) {
        SpringApplication.run(AppZuul.class,args);
        System.out.println("网关zuul服务启动成功！！！");
    }

}
