package com.nt.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Person;
import com.nt.beans.Person1;

public class Test {

	public static void main(String[] args) {
		//creating ioc container 
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//calling bean id
		Person p=ctx.getBean("person",Person.class);
		System.out.println(p);
		Person1 p1=ctx.getBean("person1",Person1.class);
		System.out.println(p1);

	}

}
