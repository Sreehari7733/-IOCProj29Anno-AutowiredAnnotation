package com.nt.beans;

public class DTDC implements Corrier{

	
	public DTDC() {
		System.out.println("0-Param constructor inn dtdc");
	}
	
	public String delivery(int oid) {
		return "flipkart order is delivered by dtdc"+oid+"is delivered..";
	}
	
}
