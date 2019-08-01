package com.wy.demo.web2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "hhh", description = "ggg")
public class Demo2Controller {

	@PostMapping("/hello2")
	@ApiOperation(value = "hello", notes = "hello hello")
	public String hello2() {
		return null;
	}


}

