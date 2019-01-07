package com.amc.main.dto;

public class JobRecordDto {
	
	int workId;
	int assignId;
	String hourSpent;
	String date;
	public int getWorkId() {
		return workId;
	}
	public void setWorkId(int workId) {
		this.workId = workId;
	}
	public int getAssignId() {
		return assignId;
	}
	public void setAssignId(int assignId) {
		this.assignId = assignId;
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
