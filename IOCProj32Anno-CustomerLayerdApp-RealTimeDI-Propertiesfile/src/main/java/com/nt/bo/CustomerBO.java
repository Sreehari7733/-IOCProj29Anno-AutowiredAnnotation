package com.nt.bo;

import java.io.Serializable;

import lombok.Data;
@Data
public class CustomerBO implements Serializable{
	
	private String cName,cAddr;
	private float pAmt,rate,time,intrAmt;
	
	public CustomerBO() {
		System.out.println("constructor for bo class..");
	}
}
