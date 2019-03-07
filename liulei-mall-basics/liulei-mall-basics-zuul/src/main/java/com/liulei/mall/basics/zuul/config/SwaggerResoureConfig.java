package com.liulei.mall.basics.zuul.config;

import org.springframework.cloud.netflix.zuul.filters.Route;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 设置 swagger 列表配置
 * @Author: liulei
 * @CreateDate: 2018/12/27 下午3:04
 * @Version: 1.0
 */
@Component
@Primary
//@Profile("dev")
public class SwaggerResoureConfig implements SwaggerResourcesProvider {

    private final RouteLocator routeLocator;

    private static final String SWAGGER_API="-api";

    public SwaggerResoureConfig(RouteLocator routeLocator) {
        this.routeLocator = routeLocator;
    }

    /**
    * 在zuul网关中设置swagger列表
    * @author      liulei
    * @return
    * @exception
    * @date        2018/12/27 下午3:24
    */
    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        List<Route> routes = routeLocator.getRoutes();
        //获取网关规则ID，并将已-api结尾的规则加入swagger列表
        routes.forEach(route -> {
            String routeID=route.getId();
            String px = routeID.substring(routeID.length()-4,routeID.length());
            if(SWAGGER_API.equals(px)) {
                resources.add(getSwaggerResoure(routeID, route.getFullPath().replace("**", "v2/api-docs"), "1.0"));
            }
        });
        return resources;
    }

    private SwaggerResource getSwaggerResoure(String name, String loc, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(loc);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}