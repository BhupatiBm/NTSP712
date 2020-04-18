package com.nt.dao;

public interface BankDAO {
	public float depostie(int acno,float amount);
	public float withdraw(int acno,float amount);
}
