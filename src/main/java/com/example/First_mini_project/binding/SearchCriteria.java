package com.example.First_mini_project.binding;

public class SearchCriteria {

	String coursename;
	String enqStatus;
	String mode;
	public SearchCriteria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchCriteria(String coursename, String enqStatus, String mode) {
		super();
		this.coursename = coursename;
		this.enqStatus = enqStatus;
		this.mode = mode;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getEnqStatus() {
		return enqStatus;
	}
	public void setEnqStatus(String enqStatus) {
		this.enqStatus = enqStatus;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	


}
