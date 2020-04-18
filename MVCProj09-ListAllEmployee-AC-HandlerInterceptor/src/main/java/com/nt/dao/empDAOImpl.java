package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.bo.empBO;

public class empDAOImpl implements empDAO {
	private static final String EMP_DETAILS_QUERRY="SELECT EMPNO,ENAME,JOB,SAL FROM EMP ";
	JdbcTemplate jt;
	
	
	public empDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}


	public List<empBO> jobDetails() {
		List<empBO> bo=null;
		bo=jt.query(EMP_DETAILS_QUERRY, new jobDetailsExtractor());
		
		return bo;
	}

	private class jobDetailsExtractor implements ResultSetExtractor<List<empBO>>{

		public List<empBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<empBO> listBO=null;
			empBO bo=null;
			listBO=new ArrayList();
			while(rs.next()) {
				bo=new empBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEmpName(rs.getString(2));
				bo.setEmpJob(rs.getString(3));
				bo.setEmpSal(rs.getFloat(4));
				listBO.add(bo);
			}
			return listBO;
		}
		
	}//inner class
	
}
