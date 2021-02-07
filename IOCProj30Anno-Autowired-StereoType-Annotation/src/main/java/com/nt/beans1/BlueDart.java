package com.nt.beans1;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements ICorrier {

	public BlueDart() {
		System.out.println("0-param constructor for blue dart corrier...");
	}
	 
	public void delivery(int oid)
	{
		System.out.println("order delivered by bluedart with"+oid+"as order id..");
	}

	
}
