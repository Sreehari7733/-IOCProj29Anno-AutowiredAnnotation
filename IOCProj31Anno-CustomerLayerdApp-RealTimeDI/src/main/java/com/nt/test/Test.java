package com.nt.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.CustomerController;
import com.nt.vo.CustomerVo;

public class Test {

	public static void main(String a[])
	{
		//creating ioc container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//creating customer vo object class
		
		CustomerVo vo=new CustomerVo();
		CustomerController controller=ctx.getBean("controller",CustomerController.class);
		//creating Scanner class obj
		Scanner s=new Scanner(System.in);
		System.out.println("Enter customer name:");
		String cName=s.next();
		System.out.println("Enter customer address:");
		String cAdd=s.next();
		System.out.println("enter customer amount");
		String pAmt=s.next();
		System.out.println("Enter customer intetest rate");
		String rate=s.next();
		System.out.println("Enter customer time:");
		String time=s.next();
		vo.setCAdd(cAdd);vo.setCName(cName);vo.setPAmt(pAmt);vo.setRate(rate);vo.setTime(time);
		try {
			String result=controller.processCustomer(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
