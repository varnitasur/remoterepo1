package com.mindtree.clientportal.entity;

public class Client {

	private int clientid;
	private String clientname;
	private int clientbudget;
	private int companyid;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(int clientid, String clientname, int clientbudget, int companyid) {
		super();
		this.clientid = clientid;
		this.clientname = clientname;
		this.clientbudget = clientbudget;
		this.companyid = companyid;
	}
	public int getClientid() {
		return clientid;
	}
	public void setClientid(int clientid) {
		this.clientid = clientid;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public int getClientbudget() {
		return clientbudget;
	}
	public void setClientbudget(int clientbudget) {
		this.clientbudget = clientbudget;
	}
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	
}
