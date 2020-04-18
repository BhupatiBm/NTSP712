package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static final String INSERT_EMPLOYEE_QUERY="INSERT INTO  EMPLOYEE_DETAILS VALUES(?,?,?,?,?)";
	private DataSource ds;
	
	public EmployeeDAOImpl(DataSource ds) {
		System.out.println("EmployeeDAOImpl:: 1-param constructor");
		this.ds = ds;
	}

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		System.out.println("EmployeeDAOImpl.insert()");
		
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		con=ds.getConnection();
		ps=con.prepareStatement(INSERT_EMPLOYEE_QUERY);
		ps.setInt(1, bo.getEmpNo());
		ps.setString(2,bo.getEmpName());
		ps.setString(3,bo.getEmpDept());
		ps.setFloat(4, bo.getEmpSall());
		ps.setFloat(5, bo.getEmoGrosSsal());
		count=ps.executeUpdate();
		ps.close();
		con.close();
		return count;
	}

}
