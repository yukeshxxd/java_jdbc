package com.ex5;

public class product {
	String pid;
	String pname;
	String ptype;
	int pcost;
	

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public int getPcost() {
		return pcost;
	}

	public void setPcost(int pcost) {
		this.pcost = pcost;
	}
	
	public void setPid(String pid)
	{
		this.pid=pid;
		//System.out.println(pid);
	}
	
	public String getPid()
	{
		return pid;
	}
}

