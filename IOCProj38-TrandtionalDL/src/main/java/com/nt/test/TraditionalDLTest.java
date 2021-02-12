package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class TraditionalDLTest {
	public static void main(String a[]) {
		//creating ioc container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Cricketer ck=ctx.getBean("bat",Cricketer.class);
		ck.bowling();
		ck.fielding();
		ck.batting();
	}
}
