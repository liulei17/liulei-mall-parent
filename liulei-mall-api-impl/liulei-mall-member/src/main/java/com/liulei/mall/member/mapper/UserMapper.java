package com.liulei.mall.member.mapper;

import com.liulei.mall.member.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


/**
* @Description:    用户信息数据操作类
* @Author:         liulei
* @CreateDate:     2019/1/16 下午3:08
* @Version:        1.0
*/
@Repository
public interface UserMapper {

	/**
	* 用户信息注册
	* @author      liulei
	* @param userEntity
	* @return
	* @exception
	* @date        2019/1/16 下午3:10
	*/
	@Insert("INSERT INTO `liulei_user` VALUES (null,#{mobile}, #{email}, #{password}, #{userName}, null, null, null, '1', null, null, null);")
	int registerUserInfo(UserEntity userEntity);

	/**
	* 根据手机号码查询用户信息
	* @author      liulei
	* @param mobile
	* @return
	* @exception
	* @date        2019/1/16 下午3:09
	*/
	@Select("SELECT * FROM liulei_user WHERE MOBILE=#{mobile};")
	UserEntity queryMobileExist(@Param("mobile") String mobile);
}
