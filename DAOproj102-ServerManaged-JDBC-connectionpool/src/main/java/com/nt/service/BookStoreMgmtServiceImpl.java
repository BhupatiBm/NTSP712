package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.BookStoreDAO;


@Service("BookStoreService")
public class BookStoreMgmtServiceImpl implements BookStoreMgmtService {
	@Autowired
	private  BookStoreDAO dao;


	@Override
	public List<Map<String, Object>> searchBookByCatagory(String catagory) {
		List<Map<String,Object>> list=null;
		//use DAO
		list=dao.getBookByCatagory(catagory);
		System.out.println(list.size());
		return list;
	}

}
