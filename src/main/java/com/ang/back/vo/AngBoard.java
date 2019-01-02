package com.ang.back.vo;

import org.apache.ibatis.type.Alias;

@Alias("AngBoard")
public class AngBoard {

	private Integer num;
	private String title;
	private String content;
	private String wdate;
	private Integer writer;
	private Integer cnt;
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	
	public Integer getWriter() {
		return writer;
	}
	public void setWriter(Integer writer) {
		this.writer = writer;
	}
	public Integer getCnt() {
		return cnt;
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "AngBoard [num=" + num + ", title=" + title + ", content=" + content + ", wdate=" + wdate + ", writer="
				+ writer + ", cnt=" + cnt + "]";
	}
	
}
