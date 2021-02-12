package com.nt.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner; 
class Main 
{ 
	public static void main(String a[]) 
	{ 
		//Creating the connection 
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String user = "system"; 
		String pass = "Srees7733"; 

		//Entering the data 
		Scanner k = new Scanner(System.in); 
		System.out.println("enter name"); 
		String name = k.next(); 
		System.out.println("enter roll no"); 
		int roll = k.nextInt(); 
		System.out.println("enter class"); 
		String cls = k.next(); 

		//Inserting data using SQL query 
		String sql = "insert into student2 values('"+name+"',"+roll+",'"+cls+"')"; 
		Connection con=null; 
		try
		{ 
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 

			//Reference to connection interface 
			con = DriverManager.getConnection(url,user,pass); 

			Statement st = con.createStatement(); 
			int m = st.executeUpdate(sql); 
			if (m == 1) 
				System.out.println("inserted successfully : "+sql); 
			else
				System.out.println("insertion failed"); 
			con.close(); 
		} 
		catch(Exception ex) 
		{ 
			System.err.println(ex); 
		} 
	} 
}