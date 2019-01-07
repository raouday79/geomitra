package com.amc.main.dto;

public class JobAssignDto {
	
	
	int jobAssignId;
	int empId;
	int jobId;
	String start;
	String end;
	String totalHours;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getTotalHours() {
		return totalHours;
	}
	public void setTotalHours(String totalHours) {
		this.totalHours = totalHours;
	}
	public int getJobAssignId() {
		return jobAssignId;
	}
	public void setJobAssignId(int jobAssignId) {
		this.jobAssignId = jobAssignId;
	}
		

}
