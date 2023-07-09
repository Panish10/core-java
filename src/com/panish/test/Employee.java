package com.test;

import java.util.List;

public class Employee {
	private String empId;
	private String name;
	List<Address> addresses;
	
	
	public Employee(String empId, String name, List<Address> addresses) {
		super();
		this.empId = empId;
		this.name = name;
		this.addresses = addresses;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", addresses=" + addresses + "]";
	}
	
	
}
