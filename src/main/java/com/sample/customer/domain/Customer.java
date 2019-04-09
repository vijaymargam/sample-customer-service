package com.sample.customer.domain;

import java.io.Serializable;

public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2006411770705516491L;
	
	private int custId;
	private String name;
	private String mobile;
	private String email;
	private String address;
	
	public Customer() {}
	
	public Customer(int custId, String name, String mobile, String email, String address) {
		super();
		this.custId = custId;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
