package com.mindtree.clientportal.entity;

public class Company {
	
	private int companyid;
	private String companyname;
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int companyid, String companyname) {
		super();
		this.companyid = companyid;
		this.companyname = companyname;
	}
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	

}
