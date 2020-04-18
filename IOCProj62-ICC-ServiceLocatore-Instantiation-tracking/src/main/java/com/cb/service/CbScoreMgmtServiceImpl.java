/**
 * 
 */
package com.cb.service;

import com.icc.external.IccScoreComp;

public class CbScoreMgmtServiceImpl implements CbScoreMgmtService {
	private  IccScoreComp extComp;
	
	public CbScoreMgmtServiceImpl(IccScoreComp extComp) {
		System.out.println("CbScoreMgmtServiceImpl: 0 param constructor");
		this.extComp=extComp;
	}
	@Override
	public String getScore(int mid) {
		
		return extComp.getScore(mid);
	}

}
