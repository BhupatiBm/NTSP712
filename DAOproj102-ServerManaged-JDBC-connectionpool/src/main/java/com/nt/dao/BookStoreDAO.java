package com.nt.dao;


import java.util.List;
import java.util.Map;

public interface BookStoreDAO {
	public  List<Map<String,Object>>  getBookByCatagory(String location);
}
