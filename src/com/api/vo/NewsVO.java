package com.api.vo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NewsVO {
	private Integer newsId;
	public Integer getNewsId() {
		return newsId;
	}
	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}
	public String getNewsName() {
		return newsName;
	}
	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}
	public String getNewsText() {
		return newsText;
	}
	public void setNewsText(String newsText) {
		this.newsText = newsText;
	}
	private String newsName;
	private String status;
	private Integer startDate;
	private Integer startTime;
	private Integer endDate;
	private Integer endTime;
	private String newsText;
	private String hyperlink;
	private byte[] imageFile;
	private String imageExt;
	private String remark;
	private String autoSend;
	private String sendFreq;
	private Integer sendTime;
	private Integer sendDate;
	private Integer crtDate;
	private Integer crtTime;
	private Integer crtUser;
	private String crtUserName;
	private Integer updDate;
	private Integer updTime;
}
