package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;
public class Test {
@SuppressWarnings("resource")
public static void main(String a[]) {
	//Create application Context container
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	
	Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
	String msg=fpkt.delivered(new String[] {"ball","laptop","pen"}, new float[] {500.0f,200000.0f,100.0f});
	System.out.println(msg);
}
}
