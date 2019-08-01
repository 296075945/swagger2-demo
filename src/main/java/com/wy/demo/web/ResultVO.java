package com.wy.demo.web;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "统一返回结果")
public class ResultVO<T> {

	@ApiModelProperty(value = "结果状态",position = 1,example = "200")
	private Integer status;
	@ApiModelProperty(value = "结果信息",position = 2 ,example = "请求成功")
	private String msg;
	@ApiModelProperty(value = "结果数据",position = 3)
	private T data;

	public static <T> ResultVO<T> success(T data) {
		ResultVO<T> rs = new ResultVO<T>();
		rs.status = 200;
		rs.msg = "请求成功";
		rs.data = data;
		return rs;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
