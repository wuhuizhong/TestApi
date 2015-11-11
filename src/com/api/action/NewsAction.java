package com.api.action;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.api.base.action.BaseAction;
import com.api.vo.NewsVO;
@Controller
@Scope("prototype")
public class NewsAction extends BaseAction<NewsVO> {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(NewsAction.class);
	@Autowired
	@Override
	public void setVo(NewsVO vo) {
		this.vo = vo;
	}
	
	public String createNews(){
		
		@SuppressWarnings("unused")
		String newsName=vo.getNewsName();
		@SuppressWarnings("unused")
		String newsText = vo.getNewsText();
		
		return JSON;
	}

}
