package com.nt.jdbc;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class EmpsCountApp {

	public static void main(String[] args) {
		InputStream is=null;
		Properties props=null;
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			//Locate properties file using InputStream
			is=new FileInputStream("src/com/nt/commons/jdbc.properties");
			//read properties file info and store into java.util.Properties class object
			props=new Properties();
			props.load(is);
			//register jdbc driver 
			Class.forName(props.getProperty("jdbc.driver"));
			//establish the connection
			con=DriverManager.getConnection(props.getProperty("jdbc.url"),
					                                                           props.getProperty("jdbc.username"),
					                                                           props.getProperty("jdbc.password"));
			//create JDBC statement object
			st=con.createStatement();
			//send and execute SQL Query
			rs=st.executeQuery("SELECT COUNT(*) FROM EMP");
			//process the ResultSet obj
			rs.next();
			System.out.println("emps  count::"+rs.getInt(1));
		}//try
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//close jdbc objs
			try {
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(st!=null)
					st.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
		}

	}

}
