package com.nt.service;

import com.nt.dto.CustomerDTO;

public interface ICustomerService {
	
	public String calculateInterestAmt(CustomerDTO dto) throws Exception;
}
