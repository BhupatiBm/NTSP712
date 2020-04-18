package com.cb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icc.external.IccScoreComp;

@Service("cbService")
public class CBScoreMgmtServiceImpl implements CBScoreMgmtService {
     @Autowired
	private  IccScoreComp  extComp;
	
	 

	 

	@Override
	public String getScore(int mid) {
		  //use External  comp ref
		return extComp.getScore(mid);	
		}

}
