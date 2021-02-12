package com.nt.beans;

import javax.inject.Named;

@Named("corrier")
public class BlueDart implements ICorrier{

	public BlueDart() {

		System.out.println("default constructor for bluedart corrier...");
	}
	
	public void delivery(int oid )
	{
		System.out.println("order is delivered by Blue dart with order number"+oid );
	}
	
	

}
