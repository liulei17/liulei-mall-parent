package com.liulei.mall;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.FeignClient;

/**
* @Description:    微信服务启动类
* @Author:         liulei
* @CreateDate:     2019/1/17 上午9:24
* @Version:        1.0
*/
@EnableSwagger2Doc
@SpringBootApplication
@FeignClient
@EnableEurekaClient
@MapperScan(basePackages = "com.liulei.mall.wechat.mapper")
public class AppWechat {
    public static void main(String[] args) {
        SpringApplication.run(AppWechat.class,args);
        System.out.println("微信服务启动成功！！！");
    }
}
