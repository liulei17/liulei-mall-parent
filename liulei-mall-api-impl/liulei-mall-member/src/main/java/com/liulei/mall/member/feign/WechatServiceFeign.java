package com.liulei.mall.member.feign;

import com.liulei.mall.wechat.service.WechatService;
import org.springframework.cloud.openfeign.FeignClient;

/**
* @Description:    调用微信服务Feign客户端
* @Author:         liulei
* @CreateDate:     2019/1/16 下午2:40
* @Version:        1.0
*/
@FeignClient("liulei-mall-wechat")
public interface WechatServiceFeign extends WechatService {

}
