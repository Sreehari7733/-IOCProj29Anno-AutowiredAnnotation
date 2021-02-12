package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoteElgibilityChecking;

public class VoteEligibilityTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applictionContext.xml");
		VoteElgibilityChecking vc=ctx.getBean("voter",VoteElgibilityChecking.class);
		System.out.println(vc.checkElgibility());
		((AbstractApplicationContext) ctx).close();

	}

}
