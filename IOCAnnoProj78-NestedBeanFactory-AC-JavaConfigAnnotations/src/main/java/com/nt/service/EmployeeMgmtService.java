package com.nt.service;

import java.util.List;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import com.nt.dto.EmployeeDTO;

public interface EmployeeMgmtService {
	
	public    @NonNull List<EmployeeDTO>  fetchEmpsByDesgs(@Nullable String desg1,@Nullable String desg2)throws Exception;

}
