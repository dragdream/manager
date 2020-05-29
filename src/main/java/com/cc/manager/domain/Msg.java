package com.cc.manager.domain;

/**
 * 
 * @ClassName: Msg
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author: chumengcheng
 * @date: 2020年5月29日 下午4:05:26
 */
public class Msg {

	private String title;
	private String content;
	private String etraInfo;

	public Msg(String title, String content, String etraInfo) {
		super();
		this.title = title;
		this.content = content;
		this.etraInfo = etraInfo;
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

	public String getEtraInfo() {
		return etraInfo;
	}

	public void setEtraInfo(String etraInfo) {
		this.etraInfo = etraInfo;
	}

}
