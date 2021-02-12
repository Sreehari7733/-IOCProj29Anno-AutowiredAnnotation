package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.nt.bo.CustomerBO;

@Repository("oracle")
@Primary
public class ICustomerDAOImplOra implements ICustomerDAO{
	public String ISNERT_QUERY="insert into layered_customer values(CUSTNO_SEQUENCE.NEXTVAL,?,?,?,?,?,?)";
	@Autowired
	private DataSource ds;
	
	public int insert(CustomerBO bo) throws Exception {
		
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(ISNERT_QUERY);
		ps.setString(1,bo.getCName());
		ps.setString(2,bo.getCAddr());
		ps.setFloat(3,bo.getPAmt());
		ps.setFloat(4,bo.getRate());
		ps.setFloat(5, bo.getTime());
		ps.setFloat(6,bo.getIntrAmt());
		int res=ps.executeUpdate();
		return res;
	}

}
