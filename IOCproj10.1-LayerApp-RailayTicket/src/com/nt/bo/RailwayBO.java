package com.nt.bo;

public class RailwayBO {
	private int TicketNo;
	private String PassangerName;
	private String Gender;
	private int Age;
	private String Origin;
	private String Destination;
	private float TotalFare;
	private float DiscountAmt;
	
	public int getTicketNo() {
		return TicketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.TicketNo = ticketNo;
	}
	public String getPassangerName() {
		return PassangerName;
	}
	public void setPassangerName(String passangerName) {
		this.PassangerName = passangerName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		this.Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	public String getOrigin() {
		return Origin;
	}
	public void setOrigin(String origin) {
		this.Origin = origin;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		this.Destination = destination;
	}
	public float getTotalFare() {
		return TotalFare;
	}
	public void setTotalFare(float totalFare) {
		this.TotalFare = totalFare;
	}
	public float getDiscountAmt() {
		return DiscountAmt;
	}
	public void setDiscountAmt(float discountAmt) {
		this.DiscountAmt = discountAmt;
	}

}
