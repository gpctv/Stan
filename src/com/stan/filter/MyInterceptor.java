package com.stan.filter;

import java.util.Map;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	 System.out.println("destory test");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		 System.out.println("init test");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("---------intercept()---------");
		Map session = invocation.getInvocationContext().getSession();
		if (session.get("username") != null) {
			System.out.println(invocation.invoke());
			
			return invocation.invoke();
		} else {
			return "login";
		}
		 
	}

}
