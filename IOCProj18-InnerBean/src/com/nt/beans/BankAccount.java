package com.nt.beans;

public class BankAccount {
	private int accno;
	private String holderName;
	private float balance;
	private boolean NRIbanking;
	
	public BankAccount() {
		System.out.println("BankAccount.()::0 param constructor");
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void setNRIbanking(boolean nRIbanking) {
		NRIbanking = nRIbanking;
	}
	
	public float showBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", holderName=" + holderName + ", balance=" + balance + ", NRIbanking="
				+ NRIbanking + "]";
	}
	
	
}
