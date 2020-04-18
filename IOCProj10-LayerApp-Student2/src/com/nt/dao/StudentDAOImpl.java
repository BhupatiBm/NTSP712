package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String STUDENT_TABLE="INSERT INTO STUDENT_RESULT VALUES(?,?,?,?,?,?,?,?)";
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
		ps.setInt(1,bo.getSno());
		ps.setString(2, bo.getSname());
		ps.setString(3, bo.getSaddress());
		ps.setInt(4, bo.getM1());
		ps.setInt(5, bo.getM2());
		ps.setInt(6, bo.getM3());
		ps.setFloat(7, bo.getSavg());
		ps.setString(8, bo.getSresult());
		count=ps.executeUpdate();
		ps.close();
		con.close();
		return count;
	}
}
