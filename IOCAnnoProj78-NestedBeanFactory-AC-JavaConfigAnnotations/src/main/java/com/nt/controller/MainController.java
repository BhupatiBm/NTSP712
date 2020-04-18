package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtService;
import com.nt.vo.EmployeeVO;

@Named("controller")
public class MainController {
	
	@Inject
	@Nullable
	private  EmployeeMgmtService  service;

	public MainController(@Nullable EmployeeMgmtService service) {
		this.service = service;
	}
	
	public   @NonNull List<EmployeeVO>  showEmpsByDesgs(@Nullable String desg1,@Nullable String desg2)throws Exception{
		List<EmployeeDTO> listDTO=null;
		List<EmployeeVO> listVO=null;
		EmployeeVO  vo=null;
		//use service
		listDTO=service.fetchEmpsByDesgs(desg1, desg2);
		//convert listDTO to listVO
		listVO=new ArrayList();
		for(EmployeeDTO dto:listDTO) {
			//convert each DTO class object to each VO class object
			vo=new EmployeeVO();
			vo.setEid(String.valueOf(dto.getEid()));
			vo.setEname(dto.getEname());
			vo.setJob(dto.getJob());
			vo.setSalary(String.valueOf(dto.getSalary()));
			vo.setSrNo(String.valueOf(dto.getSrNo()));
			vo.setDeptNo(String.valueOf(dto.getDeptNo()));
			//add each VO class obj to listVO
			listVO.add(vo);
		}
		
		return listVO;
	}//method
	

}//class
