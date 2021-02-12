package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {
	
	private String name;
	
	private int jerseyNo;
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}


	public Cricketer() {
		System.out.println("cricketer 0-param constructor..");	
	}
	
	public void bowling() {
		System.out.println("Mr."+name+"is having "+jerseyNo+" as now bowling");
	}
	
	public void fielding() {
		System.out.println("Mr."+name+"is having "+jerseyNo+"as now fielding");
	}
	
	public void batting() {
		System.out.println("Mr. "+name+" is having"+jerseyNo+" as now batting");
		//creating ioc container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//calling cricketer obj
		CricketerBat bat=ctx.getBean("cric",CricketerBat.class);
		int score=bat.showScore();
		System.out.println("Mr. "+name+"has scored"+score);
	}
}
