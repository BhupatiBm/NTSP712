package com.icc.external;

public class IccScoreCompImpl implements IccScoreComp {

	@Override
	public String getScore(int mid) {
		
		if(mid==1001)
			return "IND vs WI:Ind(bat)::300/3";
		else if(mid==1002)
			return "AUS vs ING:Aus(bat)::150/5";
		else
			throw new IllegalArgumentException("invaid match id");
	}

}
