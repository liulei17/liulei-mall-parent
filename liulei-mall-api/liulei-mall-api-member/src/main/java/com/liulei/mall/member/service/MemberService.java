package com.liulei.mall.member.service;

import com.liulei.mall.basics.common.BaseResponse;
import com.liulei.mall.member.entity.UserEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @Description:    会员服务接口
* @Author:         liulei
* @CreateDate:     2019/1/16 下午2:09
* @Version:        1.0
*/
@Api(tags = "会员服务接口")
public interface MemberService {

	/**
	* 根据手机号码查询是否已经存在,如果存在返回当前用户信息
	* @author      liulei
	* @param mobile 手机号码
	* @return
	* @exception
	* @date        2019/1/16 下午2:10
	*/
	@ApiOperation(value = "根据手机号码查询是否已经存在")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "mobile", dataType = "String", required = true, value = "手机号码")
	})
	@PostMapping("/queryMobileExist")
	BaseResponse queryMobileExist(@RequestParam("mobile") String mobile);

	/**
	* 方法实现说明
	* @author      liulei
	* @param registCode
	 * @param userEntity
	* @return
	* @exception
	* @date        2019/1/16 下午2:19
	*/
	@ApiOperation(value = "会员用户注册信息接口")
	@PostMapping("/registerUserInfo")
	BaseResponse registerUserInfo(@RequestBody UserEntity userEntity, @RequestParam("registCode") String registCode);


}
