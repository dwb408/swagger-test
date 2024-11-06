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

@Tag(name = "テストController", description = "テストdescription")
@RestController
@RequestMapping("test")
public class TestController {

	@Operation(summary = "テストGET", description = "GET方式でRequest")
    @ApiResponse(responseCode = "200", description = "Request成功")
    @ApiResponse(responseCode = "403", description = "登録情報なし或いは登録情報無効の場合")
	@GetMapping("hello")
	public String helloWorld() {
		return "Hello World";
	}

	@Operation(summary = "IDによってユーザー情報取得", description = "IDによってユーザー情報取得")
	@Parameters(@Parameter(name = "id", description = "ユーザID,最大長さ:1000", required = true))
	@ApiResponse(content = @Content(mediaType = "application/json", schema = @Schema(implementation = TestUser.class)))
	@PostMapping("getUser")
	public TestUser getUser(Integer id) {
		TestUser user = new TestUser();
		user.setId(id);
		user.setUserName("テストユーザー" + id);
		return user;
	}
	
}
