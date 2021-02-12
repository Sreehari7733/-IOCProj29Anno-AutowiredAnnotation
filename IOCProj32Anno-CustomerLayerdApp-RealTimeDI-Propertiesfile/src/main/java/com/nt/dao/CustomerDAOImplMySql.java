package com.nt.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.nt.bo.CustomerBO;


public final class CustomerDAOImplMySql implements Serializable {
	public static final String INSERT_QUERY="INSERT INTO LAYERED_CUSTOMER(CNAME,CADD,PAMT,TIME,RATE,INTRAMT) VALUES(?,?,?,?,?,?)";
	@Autowired
	@Qualifier("activeDAO")
	private DataSource ds;
	
	public int insert(CustomerBO bo)throws Exception
	{
		Connection con=ds.getConnection();
		//create PreparedStatement object
		PreparedStatement ps=con.prepareStatement(INSERT_QUERY);
		//set values to query params by collecting data from BO class obj
		ps.setString(1,bo.getCName());
		ps.setString(2,bo.getCAddr());
		ps.setFloat(3, bo.getIntrAmt());
		ps.setFloat(5, bo.getTime());
		ps.setFloat(4, bo.getRate());
		ps.setFloat(6, bo.getIntrAmt());
		//execute the SQL query
		int count=ps.executeUpdate();
		//close jdbc objs
		 ps.close();
		 con.close(); //releases the jdbc con object back to jdbc con pool
		return count;
	}
	
	
}
