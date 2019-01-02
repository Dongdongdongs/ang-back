package com.ang.back.vo;

import org.apache.ibatis.type.Alias;

@Alias("AngUser")
public class AngUser {

	private int num;
	private String id;
	private String pwd;
	private String token;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "AngUser [num=" + num + ", id=" + id + ", pwd=" + pwd + ", token=" + token + ", name=" + name + "]";
	}
	
	
	
}
