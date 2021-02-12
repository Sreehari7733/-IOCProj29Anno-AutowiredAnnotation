package com.nt.dao;

import org.springframework.stereotype.Component;

import com.nt.bo.CustomerBo;
@Component("idao")
public interface ICustomerDao {
	
	public int insert(CustomerBo bo) throws Exception ;
}
