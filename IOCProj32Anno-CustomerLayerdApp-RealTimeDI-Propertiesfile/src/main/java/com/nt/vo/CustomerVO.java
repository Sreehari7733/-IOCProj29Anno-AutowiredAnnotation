package com.nt.vo;

import java.io.Serializable;

import lombok.Data;
@Data
public class CustomerVO implements Serializable {
	private String cName,cAdd,pAmt,rate,time;

	public CustomerVO() {
		System.out.println("constructor for vo class");
	}
}
