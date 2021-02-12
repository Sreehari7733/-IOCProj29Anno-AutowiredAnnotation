package com.nt.service;

import org.springframework.stereotype.Component;

import com.nt.dto.CustomerDto;
@Component("icdto")
public interface CustomerService {

	public String calculateSimpleIntAmt(CustomerDto dto) throws Exception;
}
