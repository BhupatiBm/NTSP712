package com.nt.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.empBO;
import com.nt.dao.empDAO;
import com.nt.dto.empDTO;
@Service
public class empServiceImpl implements empService {
	@Autowired
	empDAO empdao;


	public List<empDTO> jobDetails() {
		List<empBO> listbo=null;
		List<empDTO> listdto=null;
		listbo=new ArrayList();
		listdto=new ArrayList();
		listbo=empdao.jobDetails();
		for (empBO bo : listbo) {
			empDTO dto=new empDTO();
			BeanUtils.copyProperties(bo, dto);
			listdto.add(dto);
		}
		return listdto;
	}

}
