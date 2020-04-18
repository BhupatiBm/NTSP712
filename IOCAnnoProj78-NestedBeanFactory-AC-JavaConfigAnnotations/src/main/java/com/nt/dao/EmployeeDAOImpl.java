package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import com.nt.bo.EmployeeBO;

@Named("empDAO")
public final class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMPS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?) ORDER BY JOB";
	
	@Nullable
	@Inject
	private DataSource ds;

	public EmployeeDAOImpl(@Nullable DataSource ds) {
		this.ds = ds;
	}

	@Override
	public @NonNull List<EmployeeBO> getEmpsByDesgs(@Nullable String desg1,@Nullable String desg2) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<EmployeeBO> listBO=null;
		EmployeeBO bo=null;
	   try {
		   //get Pooled jdbc con object
		   con=ds.getConnection();
		   //create PreparedStatement object
		   ps=con.prepareStatement(GET_EMPS_BY_DESG);
		   //set Query param values
		   ps.setString(1, desg1);
		   ps.setString(2,desg2);
		   //execute the Query
		   rs=ps.executeQuery();
		   //copy ResultSet obj records  List of BO objs
		   listBO=new ArrayList();
		   while(rs.next()) {
			   //copy each record to one BO class object
			   bo=new EmployeeBO();
			   bo.setEid(rs.getInt(1));
			   bo.setEname(rs.getString(2));
			   bo.setJob(rs.getString(3));
			   bo.setSalary(rs.getFloat(4));
			   bo.setDeptNo(rs.getInt(5));
			   //add Each Obj of BO class to ArrayList
			   listBO.add(bo);
		   }//while
	   }//try
	   catch(SQLException se) {
		   se.printStackTrace();
		   throw se;
	   }
	   catch(Exception e) {
		   e.printStackTrace();
		   throw e;
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
			   if(ps!=null)
				   ps.close();
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
		return listBO;
	}//method
}//class
