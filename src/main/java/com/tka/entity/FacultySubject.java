package com.tka.entity;

public class FacultySubject {
	int facID;
	String facSubName;
	
	
	
	public int getFacID() {
		return facID;
	}



	public void setFacID(int facID) {
		this.facID = facID;
	}



	public String getFacSubName() {
		return facSubName;
	}



	public void setFacSubName(String facSubName) {
		this.facSubName = facSubName;
	}



	@Override
	public String toString() {
		return "FacultySubject [facID=" + facID + ", facSubName=" + facSubName + "]";
	}



	public FacultySubject(int facID, String facSubName) {
		super();
		this.facID = facID;
		this.facSubName = facSubName;
	}



	public FacultySubject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
