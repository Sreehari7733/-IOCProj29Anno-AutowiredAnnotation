package com.nt.beans;

import javax.inject.Named;

@Named("dtdc")
public class DTDC implements ICorrier{
	
	public DTDC() {
		System.out.println("default constructor for dtdc");
	}

	public void delivery(int oid ) {
		System.out.println("order is delivered by DTDC with order id"+oid);
	}

}
