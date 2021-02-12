package com.nt.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class CustomerDTO implements Serializable {
	
	private String cName,cAddr;
	private float pAmt,rate,time;
	public CustomerDTO() {
	System.out.println("constructor for dto");	
	}

}
