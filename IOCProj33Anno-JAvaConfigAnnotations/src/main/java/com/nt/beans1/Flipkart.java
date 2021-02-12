package com.nt.beans1;

import java.util.Arrays;
import java.util.Random;

import javax.inject.Inject;
import javax.inject.Named;

import com.nt.beans.ICorrier;

@Named("fpkt")
public class Flipkart {
	@Inject
	private ICorrier corrier;

	public Flipkart() {
		System.out.println("default constructor for flipkart corrier..");
		
	}
	public void shopping(String items[],float cost[]) {
		
		corrier.delivery(new Random().nextInt());
		System.out.println("items are:"+Arrays.toString(items)+"costs are:"+Arrays.toString(cost));
	}
	
	

}
