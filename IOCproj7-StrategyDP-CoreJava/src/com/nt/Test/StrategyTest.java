package com.nt.Test;

import com.nt.factory.VeichleFactory;
import com.nt.comp.Veichle;

public class StrategyTest {

	public static void main(String[] args) {
		
		Veichle viechle=null;
		try {
		viechle=VeichleFactory.getInstance();
		viechle.journy("bbsr", "sblp");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
