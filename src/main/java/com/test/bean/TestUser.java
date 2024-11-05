package com.test.bean;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "用户信息实体类")
public class TestUser {

	@Schema(name = "用户ID")
	private Integer id;

	@Schema(name = "用户名")
	private String userName;

	@Schema(name = "部门")
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
