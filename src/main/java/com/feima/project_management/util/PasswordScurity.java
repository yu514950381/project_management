package com.feima.project_management.util;


/**
 * @author 喻世琦
 * 密码加密
 * */
public class PasswordScurity {

	public static String scurity(String password){

		if(password!=null&&password.length()>0){
			password=MD5Util.MD5(password+"想看密码？impossible!");
		}
		return password;
	}
	
}
