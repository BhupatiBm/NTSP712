package com.icc.external;

public class IccScoreCompImpl implements IccScoreComp {

	@Override
	public String getScore(int mid) {
		if(mid==1001)
			 return "IND vs WI: Ind (bat) :: 300/3";
		else if(mid==1002)
			 return "AUS vs ENG:  Eng (bat) :: 100/3";
		else
		   throw new IllegalArgumentException("invalid match id");	
		
	}

}
