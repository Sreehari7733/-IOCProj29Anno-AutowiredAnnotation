package com.nt.test;

public class NewInstanceTest1 {

	public static void main(String[] args) throws Exception{
		//Load  class
		@SuppressWarnings("rawtypes")
		Class c=Class.forName(args[0]);
		//create object
		Object obj=c.newInstance();
		System.out.println("data ::"+obj);
		

	}

}
