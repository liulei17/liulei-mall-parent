package com.liulei.mall.basics.common.enums;

/**
* @Description:    返回结果状态码结果集
* @Author:         liulei
* @CreateDate:     2019/1/16 上午9:15
* @Version:        1.0
*/
public enum ResultCodeEnum {
    /** 结果状态码及对应描述 */
    _200("操作成功！"),
    _500("操作失败！"),
    _404("路径错误！"),
    _100("token不存在或已失效！"),
    _101("缺少必填参数！"),
    _102("参数校验失败！"),
    _103("登陆失败！"),
    _104("用户名或密码错误！");

    private final String msg;

    public String getMsg() {
        return msg;
    }

    ResultCodeEnum(String msg) {
        this.msg = msg;
    }
}
