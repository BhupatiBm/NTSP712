package com.nt.service;

import java.util.Calendar;

public class BankLoanAprover {
	public String Aprove(int loanId,float amount,String type) {
		Calendar calender=null;
		int month=0;
		calender=calender.getInstance();
		month=calender.get(calender.MONTH);
		if(month>=1 && month<=11) {
			if(type.equalsIgnoreCase("agriculture"))
				return loanId+" "+type+" loan for amount "+amount+" is aproved";
		}
		
		return loanId+" "+type+" loan for amount "+amount+" is Decline";	
	}

}
