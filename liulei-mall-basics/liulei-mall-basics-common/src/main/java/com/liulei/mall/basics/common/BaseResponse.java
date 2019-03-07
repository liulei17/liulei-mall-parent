package com.liulei.mall.basics.common;

import com.liulei.mall.basics.common.constants.CodeConstant;
import com.liulei.mall.basics.common.enums.ResultCodeEnum;
import lombok.Data;

/**
* @Description:    接口返回值
* @Author:         liulei
* @CreateDate:     2019/1/14 上午9:06
* @Version:        1.0
*/
@Data
public class BaseResponse {

	/**
	 * 返回码
	 */
	private Integer code;
	/**
	 * 返回消息描述
	 */
	private String msg;
	/**
	 * 返回类容
	 */
	private Object data;

	public BaseResponse() {

	}

	public BaseResponse(Integer code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	/**
	 * 设置返回值
	 * @param code 返回编码
	 * @param msg 返回消息描述
	 * @param data  返回数据
	 * @return
	 */
	public static BaseResponse setResult(Integer code, String msg, Object data) {
		return new BaseResponse(code, msg, data);
	}

	/**
	 * 操作成功返回值
	 * @param data 返回数据
	 * @return
	 */
	public static BaseResponse setResultSuccess(Object data) {
		return setResult(CodeConstant.HTTP_RES_CODE_200, ResultCodeEnum._200.getMsg(), data);
	}

	/**
	 * 操作成功返回值
	 * @param data 返回数据
	 * @return
	 */
	public static BaseResponse setResultError(Object data) {
		return setResult(CodeConstant.HTTP_RES_CODE_500, ResultCodeEnum._500.getMsg(), data);
	}

}
