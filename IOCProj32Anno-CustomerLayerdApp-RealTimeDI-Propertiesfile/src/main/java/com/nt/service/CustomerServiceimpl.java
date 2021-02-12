package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

@Service("service")
public class CustomerServiceimpl implements ICustomerService {
	
	@Autowired
	@Qualifier("activeDAO")
	private ICustomerDAO dao;
	
	public String calculateInterestAmt(CustomerDTO dto) throws Exception {
		
		CustomerBO bo=new CustomerBO();
		float intrAmt=(dto.getPAmt()*dto.getRate()*dto.getTime())/100.0f;
		bo.setCAddr(dto.getCAddr());
		bo.setCName(dto.getCName());
		bo.setPAmt(dto.getPAmt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setIntrAmt(intrAmt);
		int count=dao.insert(bo);
		return count==0?"registration faild":"redistered succesfully";
	}

}
