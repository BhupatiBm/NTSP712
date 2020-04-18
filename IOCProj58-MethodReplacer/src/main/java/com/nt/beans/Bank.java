package com.nt.beans;

public class Bank {
	public float clcIntrAmt(float pamt,float time,float rate) {
		System.out.println("Bank.clcIntrAmt()");
		return pamt*time*rate/100;
	}

}
