package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.BeanUtils;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Named("empService")
public class EmployeeMgmtServiceImpl implements EmployeeMgmtService {
   
	@Nullable
	@Inject
	private  EmployeeDAO  dao;
	
	  public EmployeeMgmtServiceImpl(@Nullable EmployeeDAO dao) {
			this.dao = dao;
		}

     
	@Override
	public @NonNull List<EmployeeDTO> fetchEmpsByDesgs(@Nullable String desg1, @Nullable String desg2) throws Exception {
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=new ArrayList();

		//use DAO
		listBO=dao.getEmpsByDesgs(desg1, desg2);
		//convert listBO to listDTO
		/*	listDTO=new ArrayList();
			for(EmployeeBO bo:listBO) {
				dto=new EmployeeDTO();
				BeanUtils.copyProperties(bo, dto);
				dto.setSrNo(listDTO.size()+1);
				listDTO.add(dto);
			}*/
		  listBO.forEach(bo->{
			  EmployeeDTO dto=new EmployeeDTO();
			  BeanUtils.copyProperties(bo,dto);
			  dto.setSrNo(listDTO.size()+1);
			  listDTO.add(dto);
		  });
			
		return listDTO;
	}//method

}//class
