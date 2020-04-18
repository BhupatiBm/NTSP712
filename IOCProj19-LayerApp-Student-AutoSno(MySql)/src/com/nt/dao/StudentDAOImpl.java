package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String STUDENT_TABLE="INSERT INTO STUDENT_LAYER(SNAME,ADDRESS,M1,M2,M3,AVERAGE,RESULT) VALUES(?,?,?,?,?,?,?)";
	private DataSource ds;
	
	public StudentDAOImpl(DataSource ds) {
		System.out.println("StudentDAOImpl::1 param constructor");
		this.ds = ds;
	}

	@Override
	public int insert(StudentBO bo) throws Exception {
		System.out.println("StudentDAOImpl.insert()");
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		con=ds.getConnection();
		ps=con.prepareStatement(STUDENT_TABLE);
		ps.setString(1, bo.getSname());
		ps.setString(2, bo.getSaddress());
		ps.setInt(3, bo.getM1());
		ps.setInt(4, bo.getM2());
		ps.setInt(5, bo.getM3());
		ps.setFloat(6, bo.getSavg());
		ps.setString(7, bo.getSresult());
		count=ps.executeUpdate();
		ps.close();
		con.close();
		return count;
	}
}
