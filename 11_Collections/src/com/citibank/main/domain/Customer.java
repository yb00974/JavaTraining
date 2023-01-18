package com.citibank.main.domain;

import java.util.Objects;

public class Customer {
	private int customerId;
	private String name;
	private String address;
	private String phno;
	public Customer(int customerId, String name, String address, String phno) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.phno = phno;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	//right click-->srource-->generate hashcode n equals
	@Override
	public int hashCode() {
		//adding sysout
		System.out.println("in hashcode");
		return Objects.hash(address, customerId, name, phno);
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && customerId == other.customerId
				&& Objects.equals(name, other.name) && Objects.equals(phno, other.phno);
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + ", phno=" + phno
				+ "]";
	}
	

}
