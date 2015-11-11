package com.api.bo;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

public interface INewsBO {
	@Transactional(readOnly=false)
	public Map<String, Object> createNews(Map<String,String> newsMap);
}
