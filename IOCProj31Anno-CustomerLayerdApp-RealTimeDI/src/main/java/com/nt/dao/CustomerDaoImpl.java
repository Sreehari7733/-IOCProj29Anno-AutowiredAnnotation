package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.bo.CustomerBo;
@Component("dao")
public class CustomerDaoImpl implements ICustomerDao{

	@Autowired
	@Qualifier("drdsOra")
	private DataSource ds;
	
	
	public CustomerDaoImpl() {
		System.out.println("default constructor for dao class..");
	}

	public String INSERT_QUERY="insert into layered_customer values(custno_sequence.NEXTVAL,?,?,?,?,?,?)";
	
	public int insert(CustomerBo bo) throws Exception{
		int msg;
		
		Connection con=ds.getConnection();
		
		PreparedStatement ps=con.prepareStatement(INSERT_QUERY);
		
		ps.setString(1,bo.getCName());
		ps.setString(2,bo.getCAdd());
		ps.setFloat(3,bo.getPAmt());
		ps.setFloat(4,bo.getRate());
		ps.setFloat(5,bo.getTime());
		ps.setFloat(6,bo.getIntrAmt());
		msg=ps.executeUpdate();
		
		return msg;
	}
	
}
