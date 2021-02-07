package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.beans1.ICorrier;

@Component("fpkt")
public class Flipkart {
	@Autowired(required=true)
	@Qualifier("dtdc")
	private ICorrier corrier;

	public Flipkart() {
		System.out.println("0-param constructor for flipkart");
	}
	
	public String shopping(String [] items,float [] rates) {
		int oid=new Random().nextInt(29999);
		corrier.delivery(oid);
		return "flipkart items are"+Arrays.toString(items)+"and rates are"+Arrays.toString(rates);
	}
	
	
}
