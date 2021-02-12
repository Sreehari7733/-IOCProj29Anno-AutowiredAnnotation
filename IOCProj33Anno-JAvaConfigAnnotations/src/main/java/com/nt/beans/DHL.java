package com.nt.beans;

import javax.inject.Named;

@Named("dhl")
public class DHL implements ICorrier{

	public DHL() {
		System.out.println("default constructor for dhl corrier..");
	}
	
	public void delivery(int oid)
	{
		System.out.println("Order is delivered by dhl corrier with order number"+oid);
	}

}
