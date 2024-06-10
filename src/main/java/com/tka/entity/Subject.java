package com.tka.entity;

public class Subject {
	int subid;
	String subName;
	@Override
	public String toString() {
		return "Subject [subid=" + subid + ", subName=" + subName + "]";
	}
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public Subject(int subid, String subName) {
		super();
		this.subid = subid;
		this.subName = subName;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
