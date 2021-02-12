package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dto.CustomerDto;
import com.nt.service.ICustomerService;
import com.nt.vo.CustomerVo;
@Component("controller")
public class CustomerController {
	@Autowired	
	private ICustomerService service;
	
	
	
	public CustomerController() {
		System.out.println("default constructor for controller class..");
		// TODO Auto-generated constructor stub
	}



	public String processCustomer(CustomerVo vo) throws Exception{

		CustomerDto dto=new CustomerDto();
		dto.setCName(vo.getCName());
		dto.setCAdd(vo.getCAdd());
		dto.setPAmt(Float.parseFloat(vo.getPAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		String res=service.calculateSimpleIntAmt(dto);
		return res;
	}
}
