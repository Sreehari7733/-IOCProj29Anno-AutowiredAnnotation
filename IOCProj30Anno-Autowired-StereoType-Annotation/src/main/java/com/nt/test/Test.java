package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class Test {
	
	public static void main(String a[])
	{
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		String msg=fpkt.shopping(new String[] {"shirt","shoes","watch"},new float[] {2999.0f,2000.0f,3999.0f});
		System.out.println(msg);
	}
}
