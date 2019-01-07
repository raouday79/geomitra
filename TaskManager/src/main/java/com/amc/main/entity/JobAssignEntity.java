package com.amc.main.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="job_assign")
public class JobAssignEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="job_assign_id")
	int jobAssignId;
	
	
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="job_id",name="job_id")
	JobEntity jobEntity; 
	
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="emp_id", name="emp_id")
	EmployeeEntity  employeeEntity; 
	
	@Column(name="emp_id",insertable=false,updatable=false)
	int empId;
	
	@Column(name="job_id",insertable=false,updatable=false)
	int jobId;
	
	
	@Column(name="job_start")
	String jobStart;
	@Column(name="job_end")
	String jobEnd;
	@Column(name="total_hr_spend")
	String totalHrSpend;
	
	
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
	public JobEntity getJobEntity() {
		return jobEntity;
	}
	public void setJobEntity(JobEntity jobEntity) {
		this.jobEntity = jobEntity;
	}
	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}
	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
	}

	public int getJobAssignId() {
		return jobAssignId;
	}
	public void setJobAssignId(int jobAssignId) {
		this.jobAssignId = jobAssignId;
	}
	
	public String getJobStart() {
		return jobStart;
	}
	public void setJobStart(String jobStart) {
		this.jobStart = jobStart;
	}
	public String getJobEnd() {
		return jobEnd;
	}
	public void setJobEnd(String jobEnd) {
		this.jobEnd = jobEnd;
	}
	public String getTotalHrSpend() {
		return totalHrSpend;
	}
	public void setTotalHrSpend(String totalHrSpend) {
		this.totalHrSpend = totalHrSpend;
	}

		
	
}
