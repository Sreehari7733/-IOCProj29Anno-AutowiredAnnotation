package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoteEligibilityChecking implements InitializingBean,DisposableBean {

	private String name;
	private int age;
	private Date validationDate;
	

	public VoteEligibilityChecking() {
		System.out.println("0-param constructor for vote eligibility checking...");
	}

	public void setName(String name) {
		System.out.println("setter method for name property..");
		this.name = name;
	}

	public void setAge(int age) {
		System.out.println("setter method for age property..");
		this.age = age;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method life cycle..");
		validationDate= new Date();
		if(name==null || age<=0 || age>=125|| name.equals("") || validationDate==null)
			
			
			throw new IllegalArgumentException();
	}
	public void voteEligibilityChecking()
	{
		System.out.println("b.method for vote eligibility ckecking classs...");
		if(age<18)
			System.out.println("Mr. " +name+" is having age "+age+" this person is not eligible for voting");
		else
			System.out.println("Mr. "+name+"is having age "+age+"this person is eligible for voting"
					+" voted on "+validationDate);
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method life cycle..");
		name=null;
		age=0;
		validationDate=null;
	}
	
	
	

}
