package com.feima.project_management.util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * @author mym
 * 用于获取网页里所有的表单的内容并以map的形式保存
 */
public class RequestTool {
	
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unchecked")
	public static Map getParameterMap(HttpServletRequest request){
		Map<String,Object> returnMap = new HashMap(); 
		Enumeration<String> names=request.getParameterNames();
		while(names.hasMoreElements()){
			String name=names.nextElement();
			String value=request.getParameter(name);
			String[] values=request.getParameterValues(name);
			if(values.length==1){
				returnMap.put(name, value);
			}else{
				returnMap.put(name, values);
			}
		}
		return returnMap;
	}
	
	
}
