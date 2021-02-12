package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class AwareInjectionTest {
	public static void main(String a[]) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Cricketer c=ctx.getBean("cricket",Cricketer.class);
		c.fielding();
		c.batting();
		c.bowling();
				
				
	}
}
