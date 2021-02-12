package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainer;

public class ProbleTestwithDI {

	public static void main(String[] args) {
		//creating ioc container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		WebContainer wb=ctx.getBean("webrequest",WebContainer.class);
		wb.webcontainerRequest("Haii");
		wb.webcontainerRequest("hello");
		wb.webcontainerRequest("Sreehari");

	}

}
