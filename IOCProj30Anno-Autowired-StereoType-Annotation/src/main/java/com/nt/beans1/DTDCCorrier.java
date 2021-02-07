package com.nt.beans1;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDCCorrier implements ICorrier{
	
	public DTDCCorrier() {
		System.out.println("0-param constructor for dtdc corrier..");
	}

	public void delivery(int oid) {
		System.out.println("order is delivered by dtdc with"+oid+"as order number..");
	}

}
