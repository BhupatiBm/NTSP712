package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.RailwayBO;

public class RailwayDAOImpl implements RailwayDAO {
	private static final String PASENGER_TABLE="INSERT INTO TRAIN_TICKET VALUES(?,?,?,?,?,?,?,?)";
	DataSource ds;
	
	public RailwayDAOImpl(DataSource ds) {
		System.out.println("RailwayDAOImpl.RailwayDAOImpl()");
		this.ds = ds;
	}

	@Override
	public int insertPasenger(RailwayBO bo) throws Exception {
		System.out.println("RailwayDAOImpl.insertPasenger()");
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		con=ds.getConnection();
		ps=con.prepareStatement(PASENGER_TABLE);
		ps.setInt(1, bo.getTicketNo());
		ps.setString(2, bo.getPassangerName());
		ps.setString(3, bo.getGender());
		ps.setInt(4, bo.getAge());
		ps.setString(5, bo.getOrigin());
		ps.setString(6, bo.getDestination());
		ps.setFloat(7, bo.getTotalFare());
		ps.setFloat(8, bo.getDiscountAmt());
		count=ps.executeUpdate();
		ps.close();
		con.close();
		return count;
	}

}
