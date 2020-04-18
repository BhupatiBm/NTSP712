package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("studDAO")
public  class StudentDAOImpl implements StudentDAO{
	private static final  String   STUDENT_INSERT_QUERY="INSERT INTO LAYERED_STUDENT VALUES(SNO_SEQ.NEXTVAL,?,?,?,?,?)";

	@Autowired
	private DataSource ds;


	@Override
	public int insert(StudentBO bo) throws Exception {
		System.out.println("ds class--->"+ds.getClass());
		int count=0;
		Connection con=null;
		PreparedStatement ps=null;
		//get pooled jdbc con object
		con=ds.getConnection();
		//create PreparedStatement obj having SQL Query
		ps=con.prepareStatement(STUDENT_INSERT_QUERY);
		//set values to query params
		ps.setString(1,bo.getSname());
		ps.setString(2,bo.getSadd());
		ps.setInt(3,bo.getTotal());
		ps.setFloat(4,bo.getAvg());
		ps.setString(5,bo.getResult());
      //execute the SQL Query
		count=ps.executeUpdate();
		
		//close jdbc objs
		ps.close();
		con.close();
		return count;
	}

}
