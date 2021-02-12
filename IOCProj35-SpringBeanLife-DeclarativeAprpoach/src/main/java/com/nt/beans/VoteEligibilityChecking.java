package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

public class VoteEligibilityChecking {
	
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private int age;
	
	private Date confirmationDate;
	public VoteEligibilityChecking() {
		System.out.println("0-parameter constructor for vote checking..");
	}
	public void setName(String name) {
		System.out.println("setter method for name property...");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("setter method for age property...");
		this.age = age;
	}
	
	public void init() {
		System.out.println("init() life cycle method...");
		confirmationDate=new Date();
		if(age>=125 || age<0 || name==null || confirmationDate==null || name.equals(""))
			throw new IllegalArgumentException();
		
	}
	
	public void voteEligibilityChecking()
	{
		System.out.println("b.method for vote checking class..");
		if(age<18) 
			System.out.println("Mr. "+name+"age is "+age+"so this person is not eligible for vote..");
		else
			System.out.println("Mr. "+name+"age is "+age+"so this person is eligible"
					+ " for vote and voted on"+confirmationDate);
	}
	
	public void destroy() {
		System.out.println("destroy() for ioc lifecycle..");
		name=null;
		age=0;
		confirmationDate=null;
				}
	
}
