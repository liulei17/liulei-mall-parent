package com.liulei.mall.member.service.impl;

import com.liulei.mall.basics.common.BaseResponse;
import com.liulei.mall.member.entity.UserEntity;
import com.liulei.mall.member.mapper.UserMapper;
import com.liulei.mall.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
* @Description:    会员接口实现类
* @Author:         liulei
* @CreateDate:     2019/1/16 下午2:52
* @Version:        1.0
*/
@RestController
public class MemberServiceImpl implements MemberService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public BaseResponse queryMobileExist(String mobile) {
        UserEntity userEntity=userMapper.queryMobileExist(mobile);
        if(userEntity==null){
            BaseResponse.setResultError(null);
        }
        return BaseResponse.setResultSuccess(userEntity);
    }

    @Override
    public BaseResponse registerUserInfo(UserEntity userEntity, String registCode) {

        return null;
    }
}
