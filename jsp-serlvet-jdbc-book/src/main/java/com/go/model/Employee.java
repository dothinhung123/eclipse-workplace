package com.go.model;

public class Employee {
	private Long id;
	private String name;
	private String email;
	private String address;
	private String phone;

	public Employee(Long id, String name, String email, String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
