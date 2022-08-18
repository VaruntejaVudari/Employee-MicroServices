package com.emp.entity;

public class Record {
	
	private Long cID;
	private String email;
	private String companyName;
	private Long eid;
	
	
	
	public Record(Long cID, String email, String companyName, Long eid) {
		super();
		this.cID = cID;
		this.email = email;
		this.companyName = companyName;
		this.eid = eid;
	}
	
	
	public Record() {
		super();
	}


	public Long getcID() {
		return cID;
	}
	public void setcID(Long cID) {
		this.cID = cID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	
	

}
