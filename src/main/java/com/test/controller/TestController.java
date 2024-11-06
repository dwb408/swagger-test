package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.bean.TestUser;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "测试Controller", description = "测试接口的描述")
@RestController
@RequestMapping("test")
public class TestController {

	@Operation(summary = "测试接口1", description = "无参Get测试接口")
    @ApiResponse(responseCode = "200", description = "成功获取用户信息")
    @ApiResponse(responseCode = "403", description = "用户未登录")
	@GetMapping("hello")
	public String helloWorld() {
		return "Hello World";
	}

	@Operation(summary = "测试接口2", description = "实体类参数")
	@Parameters(@Parameter(name = "id", description = "用户ID", required = true))
	@ApiResponse(content = @Content(mediaType = "application/json", schema = @Schema(implementation = TestUser.class)))
	@PostMapping("getUser")
	public TestUser getUser(Integer id) {
		TestUser user = new TestUser();
		user.setId(id);
		user.setUserName("测试用户" + id);
		return user;
	}
	
}