package com.amc.main.dto;

public class EmployeeAssignedJobDto {
	
	

	JobAssignDto assignDto;
	JobDto jobDto;
	EmployeeDto employeeDto;
	
	
	public JobAssignDto getAssignDto() {
		return assignDto;
	}
	public void setAssignDto(JobAssignDto assignDto) {
		this.assignDto = assignDto;
	}
	public EmployeeDto getEmployeeDto() {
		return employeeDto;
	}
	public void setEmployeeDto(EmployeeDto employeeDto) {
		this.employeeDto = employeeDto;
	}
	public JobDto getJobDto() {
		return jobDto;
	}
	public void setJobDto(JobDto jobDto) {
		this.jobDto = jobDto;
	}
	

	
}
