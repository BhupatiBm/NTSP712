package com.nt.Test;

import com.nt.factory.VeichleFactory;
import com.nt.comp.Veichle;

public class StrategyTest {

	public static void main(String[] args) {
		
		Veichle viechle=null;
		viechle=VeichleFactory.getInstance("water");
		viechle.journy("bbsr", "sblp");
			

	}

}
