package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_BY_SAL="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE SAL in (?,?) ";

	private DataSource ds;
	
	public EmployeeDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public List<EmployeeBO> getEmpsBySal(float v1,float v2) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<EmployeeBO> ListBo=null;
		EmployeeBO bo=null;
		try {
			con=ds.getConnection();
			ps=con.prepareStatement(GET_EMP_BY_SAL);
			ps.setFloat(1, v1);
			ps.setFloat(2, v2);
			rs=ps.executeQuery();
			ListBo=new ArrayList();
			while (rs.next()) {
				bo=new EmployeeBO();
				bo.setEid(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSalary(rs.getFloat(4));
				bo.setDeptno(rs.getInt(5));
				ListBo.add(bo);
			}//while
		}//try 
		catch (SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			try {
				if(rs!=null)
					rs.close();
				} 
			catch (SQLException se) {
				throw se;
			}
			try {
				if(ps!=null)
					ps.close();
				} 
			catch (SQLException se) {
				throw se;
			}
			try {
				if(con!=null)
					con.close();
				} 
			catch (SQLException se) {
				throw se;
			}
		}
		return ListBo;
	}

}
