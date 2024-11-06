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
@Tag(name = "テストController", description="二番名テストController")
public class Test2Controller {

	@Operation(summary="Map型APIテスト", description = "Map型APIテストdescription")
	@Parameters({@Parameter(name = "id", description = "ユーザーID,最大長さ:1000", required = true),
		@Parameter(name = "name", description = "ユーザ名,最大長さ:50", required = false),
		@Parameter(name = "dept", description = "部署名,最大長さ:50", required = false)
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
