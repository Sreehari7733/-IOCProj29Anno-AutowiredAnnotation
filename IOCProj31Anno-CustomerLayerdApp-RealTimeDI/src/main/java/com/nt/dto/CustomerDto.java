package com.nt.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class CustomerDto implements Serializable {
	
	private String cName,cAdd;
	
	private float pAmt,rate,time;
	public CustomerDto() {
	System.out.println("constructor for customerdto class..");
	}
	
	
	
}
