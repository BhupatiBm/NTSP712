package com.nt.dao;

import java.util.List;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	
	public  @NonNull List<EmployeeBO>   getEmpsByDesgs(@Nullable String desg1,@Nullable String desg2)throws Exception;

}
