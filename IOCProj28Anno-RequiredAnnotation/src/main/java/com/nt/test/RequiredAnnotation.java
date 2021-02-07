package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Robot;

public class RequiredAnnotation {
public static void main(String a[])
{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	Robot robo=ctx.getBean("robot", Robot.class);
	System.out.println(robo);
}
}
