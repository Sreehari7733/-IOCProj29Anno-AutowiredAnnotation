package com.nt.cmps;

public class Vehicle {

	private IEngg engg;
	public void setEngg(IEngg engg)
	{
		this.engg=engg;
	}
	
	public void journey(String sPlace, String dPlace) {
		engg.start();
		System.out.println("from"+sPlace);
		engg.stop();
		System.out.println("at"+dPlace);
	}
}
