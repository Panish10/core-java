package com.panish;

public class Student {
	private String name;
	private String mobileVendar;
	
	public Student(String name, String mobileVendar) {
		super();
		this.name = name;
		this.mobileVendar = mobileVendar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileVendar() {
		return mobileVendar;
	}
	public void setMobileVendar(String mobileVendar) {
		this.mobileVendar = mobileVendar;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", mobileVendar=" + mobileVendar + "]";
	}
	
}
