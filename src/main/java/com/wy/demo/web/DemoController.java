package com.wy.demo.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(tags = "hhh", description = "ggg")
public class DemoController {

	@PostMapping("/hello")
	@ApiOperation(value = "hello", notes = "hello hello")
	public ResultVO<String> hello() {
		return null;
	}

	@PostMapping("addUser")
	@ApiOperation(value = "添加用户", notes = "添加用户")
	public ResultVO<AddUserResultVO> addUser(
			@ApiParam(required = true, value = "新增用户用户信息") @RequestBody UserParamsVO user) {
		return ResultVO.success(AddUserResultVO.SUCCESS);
	}

}

@ApiModel(description = "用户信息")
class UserParamsVO {
	@ApiModelProperty(value = "用户名", position = 1, required = true)
	private String userName;
	@ApiModelProperty(value = "年龄", position = 2)
	private Integer age;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}

class AddUserResultVO {

	public static final AddUserResultVO SUCCESS = new AddUserResultVO(1, "添加成功");

	public AddUserResultVO(Integer status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}

	@ApiModelProperty(value = "结果状态", position = 1 ,example = "200")
	private Integer status;
	@ApiModelProperty(value = "结果信息", position = 2 ,example = "添加成功")
	private String msg;

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

}