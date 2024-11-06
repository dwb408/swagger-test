package com.test.bean;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "ユーザ情報Bean")
public class TestUser {

	@Schema(name = "ユーザーID",description="最大長さ:1000",defaultValue="1001")
	private Integer id;

	@Schema(name = "ユーザー名",description="最大長さ:50", defaultValue="テストユーザー")
	private String userName;

	@Schema(name = "部署",description="最大長さ:50",defaultValue="テスト開発部")
	private String dept;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "TestUser [id=" + id + ", userName=" + userName + ", dept=" + dept + "]";
	}
}
