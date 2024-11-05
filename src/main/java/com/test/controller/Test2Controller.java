package com.test.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("test2")
@Tag(name = "第二个测试接口")
public class Test2Controller {

	@Operation(summary="Map类型测试接口", description = "Map类型测试接口描述")
	@Parameters({@Parameter(name = "id", description = "用户ID", required = true),
		@Parameter(name = "name", description = "用户名", required = false),
		@Parameter(name = "dept", description = "部门", required = false)
	})
	@ApiResponses({
		@ApiResponse(responseCode = "200", description = "成功")
	})
	@PostMapping("testMap")
	public Map<String, Object> testMap(@RequestBody Map<String, Object> param){
		return param;
	}
	
	@Hidden
	@GetMapping("hidden")
	public String hidden() {
		return "hidden";
	}
}
