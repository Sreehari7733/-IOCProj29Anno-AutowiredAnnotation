package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoteEligibilityChecking;

public class VoteEligibilityCheckingTest {
	public static void main(String a[]) {
		//creation of ioc container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		VoteEligibilityChecking vc=ctx.getBean("voter",VoteEligibilityChecking.class);
		vc.voteEligibilityChecking();
		((AbstractApplicationContext) ctx).close();
	}
}
