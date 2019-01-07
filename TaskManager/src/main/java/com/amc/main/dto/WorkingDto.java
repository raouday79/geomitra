package com.amc.main.dto;

public class WorkingDto {
	
	int workId;
	EmployeeAssignedJobDto	employeeWorking;
	String hourSpent;
	String date;
	
	public EmployeeAssignedJobDto getEmployeeWorking() {
		return employeeWorking;
	}
	public void setEmployeeWorking(EmployeeAssignedJobDto employeeWorking) {
		this.employeeWorking = employeeWorking;
	}
	public int getWorkId() {
		return workId;
	}
	public void setWorkId(int workId) {
		this.workId = workId;
	}
	
	public String getHourSpent() {
		return hourSpent;
	}
	public void setHourSpent(String hourSpent) {
		this.hourSpent = hourSpent;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
