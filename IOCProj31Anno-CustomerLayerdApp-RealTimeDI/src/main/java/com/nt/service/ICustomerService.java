package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.bo.CustomerBo;
import com.nt.dao.ICustomerDao;
import com.nt.dto.CustomerDto;
@Component("service")
public class ICustomerService implements CustomerService{
	@Autowired
	private ICustomerDao dao;
	
	
	public ICustomerService() {
		System.out.println("default constructor for dervice class");
	}


	public String calculateSimpleIntAmt(CustomerDto dto) throws Exception
	{
		float intrAmt=(dto.getRate()*dto.getTime()*dto.getPAmt())/100.0f;
		
		CustomerBo cv=new CustomerBo();
		cv.setCAdd(dto.getCAdd());
		cv.setCName(dto.getCName());
		cv.setPAmt(dto.getPAmt());
		cv.setRate(dto.getRate());
		cv.setTime(dto.getTime());
		cv.setIntrAmt(intrAmt);
		int count=dao.insert(cv);
		return count==0?"Registration failed":"Registered successfully";
	}
}
