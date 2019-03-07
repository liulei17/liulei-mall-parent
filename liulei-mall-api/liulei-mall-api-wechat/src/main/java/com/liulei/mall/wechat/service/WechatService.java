package com.liulei.mall.wechat.service;

import com.liulei.mall.basics.common.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @Description:    微信服务接口
* @Author:         liulei
* @CreateDate:     2019/1/16 下午2:00
* @Version:        1.0
*/
@Api(tags = "微信服务接口")
public interface WechatService {

    /**
    * 根据手机号码验证码token是否正确
    * @author      liulei
    * @param phone
     *       手机号码
     * @param wechatCode
     *       注册码
    * @return
    * @exception
    * @date        2019/1/16 下午2:03
    */
    @ApiOperation(value = "根据手机号码验证码是否正确")
    @PostMapping("/verificaWechatCode")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "phone", dataType = "String", required = true, value = "手机号码"),
            @ApiImplicitParam(paramType = "query", name = "wechatCode", dataType = "String", required = true, value = "微信注册码") })
    BaseResponse verificaWeixinCode(@RequestParam("phone") String phone,@RequestParam("wechatCode") String wechatCode);
}
