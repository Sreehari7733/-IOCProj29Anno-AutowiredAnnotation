package com.nt.vo;

import java.io.Serializable;

import lombok.Data;
@Data
public class CustomerVo implements Serializable {

	public CustomerVo() {
		System.out.println("constructor for customervo class..");
	}
	
	private String cName,cAdd,pAmt,rate,time;

}
