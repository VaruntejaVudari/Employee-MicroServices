package com.emp.entity;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private long eid;
	private String name;
	private String phone;
	
	List<Record> records = new ArrayList<>();

	public long getEid() {
		return eid;
	}

	public void setEid(long eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Record> getRecords() {
		return records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

	public Employee(long eid, String name, String phone, List<Record> records) {
		super();
		this.eid = eid;
		this.name = name;
		this.phone = phone;
		this.records = records;
	}

	public Employee(long eid, String name, String phone) {
		super();
		this.eid = eid;
		this.name = name;
		this.phone = phone;
	}

	public Employee() {
		super();
	}
	
	
	

}
