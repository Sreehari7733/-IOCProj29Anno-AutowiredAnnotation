package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerService;
import com.nt.vo.CustomerVO;

//@Controller("controller")
@Component("controller")
public class CustomerController {
	@Autowired
	private ICustomerService service;
	
	public String processCustomer(CustomerVO vo) throws Exception
	{
		CustomerDTO dto=new CustomerDTO();
		dto.setCAddr(vo.getCAdd());
		dto.setCName(vo.getCName());
		dto.setPAmt(Float.parseFloat(vo.getPAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		String result=service.calculateInterestAmt(dto);
		return result;
		
	}
}
