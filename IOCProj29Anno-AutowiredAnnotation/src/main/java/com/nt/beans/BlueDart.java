package com.nt.beans;

public class BlueDart implements Corrier {

	public BlueDart() {
	System.out.println("0 param constructor:");	
	}
	
	public String delivery(int oid) {
		return "flipkart order is delivered by dtdc corrier"+oid+"is order id";
	}

}
